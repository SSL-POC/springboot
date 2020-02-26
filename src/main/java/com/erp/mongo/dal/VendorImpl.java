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

import com.erp.mongo.model.Vendor;

@Repository
public class VendorImpl implements VendorDAL {

	public static final Logger logger = LoggerFactory.getLogger(VendorImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	

	// save

	@Override
	public Vendor saveVendor(Vendor vendor) {
		System.out.println("Save Vendor");
		// mongoTemplate.insert(customer);//(query, RandamNumber.class);
		mongoTemplate.save(vendor);
		vendor.setStatus("success");
		return vendor;
	}

	// Load
	public List<Vendor> loadVendor(List<Vendor> list) {
		list = mongoTemplate.findAll(Vendor.class);// .find(query, OwnTree.class);
		return list;

	}

	// get
	@Override
	public List<Vendor> getVendor(String primaryKey) {
		List<Vendor> list;
		Query query = new Query();
		query.addCriteria(Criteria.where("userID").is(Integer.valueOf(primaryKey)));
		list = mongoTemplate.find(query, Vendor.class);
		return list;
		// return mongoTemplate.find(query, Publictree.class);
	}

	// update
	@Override
	public Vendor updateVendor(Vendor vendor) {
		Update update = new Update();
		Query query = new Query();
		query.addCriteria(Criteria.where("vendorcode").is(vendor.getVendorcode()));
		update.set("vendorName", vendor.getVendorName());
		update.set("phoneNumber", vendor.getPhoneNumber());
		update.set("mobileNumber", vendor.getMobileNumber());
		update.set("country", vendor.getCountry());
		update.set("email", vendor.getEmail());
		update.set("city", vendor.getCity());
		update.set("address", vendor.getAddress());
		mongoTemplate.updateFirst(query, update, Vendor.class);
		return vendor;
	}

	// revmoe
	public Vendor removeVendor(String vendorcode) {
		Vendor response = null;
		Query query = new Query();
		query.addCriteria(Criteria.where("vendorcode").is(vendorcode));
		mongoTemplate.remove(query, Vendor.class);
		return response;
	}



}
