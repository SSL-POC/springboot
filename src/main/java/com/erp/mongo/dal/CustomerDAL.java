package com.erp.mongo.dal;

import java.util.List;

import com.erp.mongo.model.Customer;
public interface CustomerDAL {

	public Customer saveCustomer(Customer customer);
	public List<Customer> loadCustomer(List<Customer> list);
	public List<Customer> getCustomer(String id);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(String id);

	
}