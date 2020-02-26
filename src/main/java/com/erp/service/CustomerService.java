package com.erp.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.annotation.Autowire;

//import javax.enterprise.inject.Produces;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.mongo.dal.CustomerDAL;
import com.erp.mongo.dal.RandomNumberDAL;
import com.erp.mongo.model.Customer;
import com.erp.mongo.model.RandomNumber;
import com.erp.util.Custom;

@SpringBootApplication
@RestController
@RequestMapping(value = "/customer")
public class CustomerService implements Filter {

	public static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

	
	// private final RandamNumberRepository randamNumberRepository;

	private final CustomerDAL customerdal;
	private final RandomNumberDAL randomnumberdal;
	Customer customer = null;

	public CustomerService(CustomerDAL customerdal, RandomNumberDAL randomnumberdal) {
		// this.randamNumberDAL = randamNumberDAL;
		this.customerdal = customerdal;
		this.randomnumberdal = randomnumberdal;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "POST,PUT, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) {
	}

	@Override
	public void destroy() {
	}

	// Save
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
		logger.info("country name -->" + customer.getCountry());
		System.out.println("--------save customer-------------");
		RandomNumber randomnumber = null;
		try {
			randomnumber = randomnumberdal.getVendorRandamNumber();
			System.out.println("Customer  random number-->" + randomnumber.getCustomerinvoicenumber());
			System.out.println("Customer  random code-->" + randomnumber.getCustomerinvoicecode());
			String invoice = randomnumber.getCustomerinvoicecode() + randomnumber.getCustomerinvoicenumber();
			System.out.println("custome code -->" + invoice);

			customer.setCustcode(invoice);
			customer.setLastedit(Custom.getCurrentInvoiceDate());
			customer.setAddeddate(Custom.getCurrentInvoiceDate());
			customer = customerdal.saveCustomer(customer);
			if (customer.getStatus().equalsIgnoreCase("success")) {
				boolean status = randomnumberdal.updateVendorRandamNumber(randomnumber, 2);
			}
			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

		} catch (Exception e) {
			customer.setStatus("failure");
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}
	
		// load
		@CrossOrigin(origins = "http://localhost:8080")
		@RequestMapping(value = "/load", method = RequestMethod.GET)
		public ResponseEntity<?> loadCustomer() {
			logger.info("------------- Inside load customer-----------------");
			List<Customer> responseList = null;
			try {
				logger.info("-----------Inside load customer Called----------");
				responseList = customerdal.loadCustomer(responseList);

			} catch (Exception e) {
				logger.info("Exception ------------->" + e.getMessage());
				e.printStackTrace();
			} finally {

			}
			return new ResponseEntity<List<Customer>>(responseList, HttpStatus.CREATED);

		}


	// get
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> geCustomer(String id) {
		logger.info("------------- Inside getTempPublicTree-----------------");
		List<Customer> responseList = null;
		try {
			logger.info("-----------Inside getTempPublicTree Called----------");
			responseList = customerdal.getCustomer(id);

		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<List<Customer>>(responseList, HttpStatus.CREATED);

	}

	// update
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {
		try {
			customer.setLastedit(Custom.getCurrentInvoiceDate());
			customer = customerdal.updateCustomer(customer);
			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}

	
	// Remove
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE)
	public ResponseEntity<?> removeCustomer(String custcode) {

		try {
			System.out.println("Remove cust code is---->" + custcode);
			customer = new Customer();
			logger.info("-----------Before Calling  removeCustomer ----------");
			customerdal.removeCustomer(custcode);
			customer.setStatus("Success");
			logger.info("-----------Successfully Called  removeCustomer ----------");

		} catch (Exception e) {
			customer.setStatus("failure");

			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);

	}

}
