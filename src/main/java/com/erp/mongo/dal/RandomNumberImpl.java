package com.erp.mongo.dal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

import com.erp.mongo.model.RandomNumber;

@Repository
public class RandomNumberImpl implements RandomNumberDAL {

	public static final Logger logger = LoggerFactory.getLogger(RandomNumberImpl.class);

	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * @Autowired ErpBo investmentBo1;
	 */

	@Override
	public RandomNumber getRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getRandamNumber-----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(1));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("PO Invoice number ----------->" + radomNumber.getPoinvoicenumber());
			logger.info("SO Invoice number ----------->" + radomNumber.getSalesinvoicenumber());
			return radomNumber;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;

		} finally {

		}

	}

	@Override
	public boolean updateRandamNumber(RandomNumber rn) {
		logger.info("current invoice number -->" + rn.getPoinvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(1));
		Update update = new Update();
		update.set("poinvoicenumber", rn.getPoinvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);// (query, RandamNumber.class);
		return true;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
	}

	@Override
	public boolean updateSalesRandamNumber(RandomNumber rn) {
		logger.info("current invoice number -->" + rn.getSalesinvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(1));
		Update update = new Update();
		update.set("salesinvoicenumber", rn.getSalesinvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);
		return true;
	}

	// ---- Vendor and customer RandomCade Getting ---
	@Override
	public RandomNumber getVendorRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getVendorRandamNumber-----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(2));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("Vendor Invoice number ----------->" + radomNumber.getVendorinvoicenumber());
			logger.info("Customer Invoice number ----------->" + radomNumber.getCustomerinvoicenumber());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updateVendorRandamNumber(RandomNumber rn, int num) {
		logger.info("current Vendor invoice number -->" + rn.getVendorinvoicenumber());
		logger.info("Number for Vendor/Customer -->" + num);
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(2));
		Update update = new Update();
		if (num == 1) {
			update.set("vendorinvoicenumber", rn.getVendorinvoicenumber() + 1);
		} else if (num == 2) {
			update.set("customerinvoicenumber", rn.getCustomerinvoicenumber() + 1);
		}
		mongoTemplate.updateFirst(query, update, RandomNumber.class);// (query, RandamNumber.class);
		return true;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
	}

	// ---- Employee RandomCade Getting ---
	@Override
	public RandomNumber getEmployeeRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getEmployeeRandamNumber-----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(4));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("Employee Invoice number ----------->" + radomNumber.getEmployeeinvoicenumber());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updateEmployeeRandamNumber(RandomNumber rn) {
		logger.info("current Employee invoice number -->" + rn.getEmployeeinvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(4));
		Update update = new Update();
		update.set("employeeinvoicenumber", rn.getEmployeeinvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);// (query, RandamNumber.class);
		return true;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
	}

	// Category and product RandomNumber Getting
	@Override
	public RandomNumber getCategoryRandomNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getcategory and prod RandamNumber-----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(3));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("category and prod Invoice number ----------->" + radomNumber.getCategoryinvoicenumber());
			logger.info("category and prod Invoice code ----------->" + radomNumber.getCategoryinvoicecode());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updateCategoryRandamNumber(RandomNumber rn, int num) {
		logger.info("current category and prod invoice number -->" + rn.getCategoryinvoicenumber());
		logger.info("Number for category -->" + num);
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(3));
		Update update = new Update();
		if (num == 1) {
			update.set("categoryinvoicenumber", rn.getCategoryinvoicenumber() + 1);
		} else if (num == 2) {
			update.set("productinvoicenumber", rn.getProductinvoicenumber() + 1);
		}
		mongoTemplate.updateFirst(query, update, RandomNumber.class);// (query, RandamNumber.class);
		return true;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
	}

	// Discount RandomNumber Getting
	@Override
	public RandomNumber getdiscountRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside discount RandamNumber-----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(5));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("Discount Invoice number ----------->" + radomNumber.getDiscountinvoicenumber());
			logger.info("Discount Invoice code ----------->" + radomNumber.getDiscountinvoicecode());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updatediscountRandamNumber(RandomNumber rn) {
		logger.info("current Discount invoice number -->" + rn.getDiscountinvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(5));
		Update update = new Update();
		update.set("discountinvoicenumber", rn.getDiscountinvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);// (query, RandamNumber.class);
		return true;// mongoTemplate.find(query, RandamNumber.class);//(RandamNumber.class);
	}

	@Override
	public RandomNumber getReturnRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getReturnRandamNumber-----------");
			Query query = new Query();
			logger.info("---------  Before addCriteria ---------");
			query.addCriteria(Criteria.where("randomID").is(6));
			logger.info("-----------  After addCriteria -----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("PO Return Invoice number ----------->" + radomNumber.getPoreturninvoicenumber());
			logger.info("SO Return Invoice number ----------->" + radomNumber.getSoreturninvoicenumber());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updateReturnRandamNumber(RandomNumber rn) {
		logger.info("current invoice number -->" + rn.getPoreturninvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(6));
		Update update = new Update();
		update.set("poreturninvoicenumber", rn.getPoreturninvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);
		return true;
	}

	@Override
	public boolean updateSalesReturnRandamNumber(RandomNumber rn) {
		logger.info("current invoice number -->" + rn.getSoreturninvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(6));
		Update update = new Update();
		update.set("soreturninvoicenumber", rn.getSoreturninvoicenumber() + 1);
		mongoTemplate.updateFirst(query, update, RandomNumber.class);
		return true;
	}

	// Category and product RandomNumber Getting
	@Override
	public RandomNumber getStockDamageRandomNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getStockDamageRandomNumber -----------");
			Query query = new Query();
			logger.info("-----------  Before addCriteria-----------");
			query.addCriteria(Criteria.where("randomID").is(7));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("StockDamage Invoice number ----------->"+radomNumber.getStockdamageinvoicenumber()
				+ "StockReturn InvoiceNumber" +radomNumber.getStockreturninvoicenumber());
			logger.info("StockDamage Invoice code ----------->"+radomNumber.getStockdamageinvoicecode()
				+ "StockReturn InvoiceCode" +radomNumber.getStockreturninvoicecode());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}

	@Override
	public boolean updateStockDamRandamNumber(RandomNumber rn, int temp) {
		logger.info("current invoice number -->" + rn.getStockdamageinvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(7));
		Update update = new Update();
		if(temp == 1) {
			logger.info("current invoice number -->"+rn.getStockreturninvoicenumber());	
			update.set("stockreturninvoicenumber", rn.getStockreturninvoicenumber()+1);			
		}else if(temp == 2) {
			logger.info("current invoice number -->"+rn.getStockdamageinvoicenumber());		
			update.set("stockdamageinvoicenumber", rn.getStockdamageinvoicenumber()+1);			
		}
		mongoTemplate.updateFirst(query, update, RandomNumber.class);
		return true;
	}
	
	
	@Override
	public RandomNumber getStockRandamNumber() {
		RandomNumber radomNumber = null;
		try {
			logger.info("----------- Inside getStockRandamNumber -----------");
			Query query = new Query();
			query.addCriteria(Criteria.where("randomID").is(8));
			logger.info("-----------  After addCriteria-----------");
			radomNumber = mongoTemplate.findOne(query, RandomNumber.class);
			logger.info("StockIn InvoiceNumber ----------->" + radomNumber.getStockIninvoicenumber());
			logger.info("StockOut InvoiceNumber ----------->" + radomNumber.getStockOutinvoicenumber());
			return radomNumber;
		} catch (Exception e) {
			e.printStackTrace();
			return radomNumber;
		} finally {

		}
	}
	
	@Override
	public boolean updateStockRandamNumber(RandomNumber rn, int temp) {
		logger.info("current invoice number -->" + rn.getStockIninvoicenumber());
		Query query = new Query();
		query.addCriteria(Criteria.where("randomID").is(8));
		Update update = new Update();
		if(temp == 1) {
			logger.info("current invoice number -->"+rn.getStockIninvoicenumber());	
			update.set("stockIninvoicenumber", rn.getStockIninvoicenumber()+1);			
		}else if(temp == 2) {
			logger.info("current invoice number -->"+rn.getStockOutinvoicenumber());		
			update.set("stockOutinvoicenumber", rn.getStockOutinvoicenumber()+1);			
		}
		mongoTemplate.updateFirst(query, update, RandomNumber.class);
		return true;
	}

}
