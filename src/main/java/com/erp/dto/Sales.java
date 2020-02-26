package com.erp.dto;

import org.codehaus.jettison.json.JSONObject;

public class Sales {
	
	
	/*
	 * Purchase(){
	 * 
	 * }
	 */
	  String productName; 
	  String category; 
	  String customerName; 
	  String soDate; 
	  String quantity; 
	  String netAmount;	 
	  String unitPrice;
	  String status;
	  String description;
	  String salesorderarray;
	  String deliveryCost;
	
	  String customerPhone;
	  String customerEmail;
	  String customerCity;
	  String customerCountry;
	  String invoiceNumber;
	  int totalAmount;
	  int totalItem;
	  String fromdate; 
	  String todate; 

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDeliveryCost() {
		return deliveryCost;
	}
	public void setDeliveryCost(String deliveryCost) {
		this.deliveryCost = deliveryCost;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSoDate() {
		return soDate;
	}
	public void setSoDate(String soDate) {
		this.soDate = soDate;
	}
	public String getSalesorderarray() {
		return salesorderarray;
	}
	public void setSalesorderarray(String salesorderarray) {
		this.salesorderarray = salesorderarray;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerCountry() {
		return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	
	
	
	
}
