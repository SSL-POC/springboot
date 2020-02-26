package com.erp.mongo.dal;

import com.erp.mongo.model.RandomNumber;

public interface RandomNumberDAL {

	public RandomNumber getRandamNumber();

	public boolean updateRandamNumber(RandomNumber rn);

	// --- Vendor Dal Random Calling --
	public RandomNumber getVendorRandamNumber();

	public boolean updateVendorRandamNumber(RandomNumber rn, int num);

	// --- Employee Dal Random Calling --
	public RandomNumber getEmployeeRandamNumber();

	public boolean updateEmployeeRandamNumber(RandomNumber rn);

	// ----Category and product RandomDAL Calling
	public RandomNumber getCategoryRandomNumber();

	public boolean updateCategoryRandamNumber(RandomNumber rn, int num);

	// --- Add Promotion Dal Random Calling --
	public RandomNumber getdiscountRandamNumber();

	public boolean updatediscountRandamNumber(RandomNumber rn);

	public boolean updateSalesRandamNumber(RandomNumber randomnumber);
	public boolean updateSalesReturnRandamNumber(RandomNumber randomnumber);

	public RandomNumber getReturnRandamNumber();
	public boolean updateReturnRandamNumber(RandomNumber randomnumber);

	
	public RandomNumber getStockDamageRandomNumber();
	public boolean updateStockDamRandamNumber(RandomNumber rn, int temp);

	public RandomNumber getStockRandamNumber();  
	public boolean updateStockRandamNumber(RandomNumber randomnumber,int temp);

}