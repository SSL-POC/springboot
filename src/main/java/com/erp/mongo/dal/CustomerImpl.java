package com.erp.mongo.dal;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.erp.mongo.model.Customer;

@Repository
public class CustomerImpl implements CustomerDAL {

	public static final Logger logger = LoggerFactory.getLogger(CustomerImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	

	// save

	@Override
	public Customer saveCustomer(Customer customer) {
		System.out.println("Save Customer");
		// mongoTemplate.insert(customer);//(query, RandamNumber.class);
		mongoTemplate.save(customer);
		customer.setStatus("success");
		return customer;
	}

	// get
	@Override
	public List<Customer> getCustomer(String primaryKey) {
		List<Customer> list;
		Query query = new Query();
		query.addCriteria(Criteria.where("userID").is(Integer.valueOf(primaryKey)));
		list = mongoTemplate.find(query, Customer.class);
		return list;
		// return mongoTemplate.find(query, Publictree.class);
	}

	// update
	@Override
	public Customer updateCustomer(Customer customer) {
		Update update = new Update();
		Query query = new Query();
		query.addCriteria(Criteria.where("custcode").is(customer.getCustcode()));
		update.set("customerName", customer.getCustomerName());
		update.set("phoneNumber", customer.getPhoneNumber());
		update.set("mobileNumber", customer.getMobileNumber());
		update.set("country", customer.getCountry());
		update.set("email", customer.getEmail());
		update.set("city", customer.getCity());
		update.set("address", customer.getAddress());
		mongoTemplate.updateFirst(query, update, Customer.class);
		return customer;
	}

	// Load
	public List<Customer> loadCustomer(List<Customer> list) {
		list = mongoTemplate.findAll(Customer.class);// .find(query, OwnTree.class);
		return list;

	}

	// Remove
	public Customer removeCustomer(String custcode) {
		Customer response = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("custcode").is(custcode));
		mongoTemplate.remove(query, Customer.class);
		return response;
	}

	

	

}
