package com.erp.service;

import java.io.IOException;
import java.util.ArrayList;
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

import com.erp.mongo.dal.RandomNumberDAL;
import com.erp.mongo.dal.VendorDAL;
import com.erp.mongo.model.RandomNumber;
import com.erp.mongo.model.Vendor;
import com.erp.util.Custom;

@SpringBootApplication
@RestController
@RequestMapping(value = "/vendor")
public class VendorService implements Filter {

	public static final Logger logger = LoggerFactory.getLogger(VendorService.class);

	/*
	 * @Autowired ErpBo erpBo;
	 * 
	 */
	// private final RandamNumberRepository randamNumberRepository;

	private final VendorDAL vendordal;
	private final RandomNumberDAL randomnumberdal;
	Vendor vendor = null;

	public VendorService(VendorDAL vendordal, RandomNumberDAL randomnumberdal) {
		this.randomnumberdal = randomnumberdal;
		this.vendordal = vendordal;
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
	public ResponseEntity<?> saveVendor(@RequestBody Vendor vendor) {
		System.out.println("--------save customer-------------");
		RandomNumber randomnumber = null;
		try {
			randomnumber = randomnumberdal.getVendorRandamNumber();
			System.out.println("Vendor Invoice random number-->" + randomnumber.getVendorinvoicenumber());
			System.out.println("Vendor Invoice random code-->" + randomnumber.getVendorinvoicecode());
			String invoice = randomnumber.getVendorinvoicecode() + randomnumber.getVendorinvoicenumber();
			System.out.println("Invoice number -->" + invoice);

			vendor.setVendorcode(invoice);
			vendor.setAddeddate(Custom.getCurrentInvoiceDate());
			System.out.println("Current Date --->" + Custom.getCurrentDate());
			vendor = vendordal.saveVendor(vendor);
			if (vendor.getStatus().equalsIgnoreCase("success")) {
				boolean status = randomnumberdal.updateVendorRandamNumber(randomnumber, 1);
			}
			return new ResponseEntity<Vendor>(vendor, HttpStatus.CREATED);
		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<Vendor>(vendor, HttpStatus.CREATED);
	}

	// load
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/load", method = RequestMethod.GET)
	public ResponseEntity<?> loadVendor() {
		logger.info("------------- Inside load vendor-----------------");
		List<Vendor> responseList = null;
		try {
			logger.info("-----------Inside load vendor Called----------");
			responseList = vendordal.loadVendor(responseList);

		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<List<Vendor>>(responseList, HttpStatus.CREATED);

	}

	// Load
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/loadvendornamecode", method = RequestMethod.GET)
	public ResponseEntity<?> loadvendornamecode() {
		logger.info("------------- Inside loadvendornamecode-----------------");
		List<Vendor> vendorlist = new ArrayList<Vendor>();
		List<String> list = new ArrayList<String>();
		try {
			logger.info("-----------Inside loadvendornamecode Called----------");
			vendorlist = vendordal.loadVendor(vendorlist);
			for (Vendor vendor : vendorlist) {
				System.out.println("vendor name-->" + vendor.getVendorName());
				list.add(vendor.getVendorName() + "-" + vendor.getVendorcode());
			}

			return new ResponseEntity<List<String>>(list, HttpStatus.CREATED);

		} catch (Exception e) {
			logger.info("loadvendornamecode Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<List<String>>(list, HttpStatus.CREATED);
	}

	// get
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> geVendor(String id) {
		logger.info("------------- Inside get Vendor -----------------");
		List<Vendor> responseList = null;
		try {
			logger.info("-----------Inside get Vendor Called----------");
			responseList = vendordal.getVendor(id);
		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<List<Vendor>>(responseList, HttpStatus.CREATED);
	}

	// update
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> updateVendor(@RequestBody Vendor vendor) {
		try {
			System.out.println("vendor update inside try--->" + vendor.getVendorcode());
			vendor = vendordal.updateVendor(vendor);
			return new ResponseEntity<Vendor>(vendor, HttpStatus.CREATED);

		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			e.printStackTrace();
		} finally {

		}
		return new ResponseEntity<Vendor>(vendor, HttpStatus.CREATED);
	}

	// Remove
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE)
	public ResponseEntity<?> removeVendor(String vendorcode) {
		try {
			vendor = new Vendor();
			logger.info("-----------Before Calling  removeCustomer ----------");
			System.out.println("Remove vendor code" + vendorcode);
			vendordal.removeVendor(vendorcode);
			vendor.setStatus("Success");
			logger.info("-----------Successfully Called  removeCustomer ----------");

		} catch (Exception e) {
			logger.info("Exception ------------->" + e.getMessage());
			vendor.setStatus("failure");
			e.printStackTrace();

		} finally {

		}
		return new ResponseEntity<Vendor>(vendor, HttpStatus.CREATED);

	}

}
