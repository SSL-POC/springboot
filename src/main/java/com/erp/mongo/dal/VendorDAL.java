package com.erp.mongo.dal;

import java.util.List;

import com.erp.mongo.model.Vendor;

public interface VendorDAL {

	public Vendor saveVendor(Vendor vendor);

	public List<Vendor> getVendor(String id);

	public Vendor updateVendor(Vendor vendor);

	public List<Vendor> loadVendor(List<Vendor> list);

	public Vendor removeVendor(String Vendorcode);

}