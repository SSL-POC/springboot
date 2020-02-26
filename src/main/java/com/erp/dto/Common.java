package com.erp.dto;

public abstract class Common {
	String username;
	String password;
	String memberID;
	String userloginPrimaryKeyString;
	int userLoginPrimaryKey;
	String memberNumber;
	double memberCommition;
	double memberOvrriding;
	String status;
	
	double TotalOverriding;
	double TotalCommission;
	
	
	String memberID1;
	
	
	
	public double getTotalCommission() {
		return TotalCommission;
	}
	public void setTotalCommission(double totalCommission) {
		TotalCommission = totalCommission;
	}
	public double getTotalOverriding() {
		return TotalOverriding;
	}
	public void setTotalOverriding(double totalOverriding) {
		TotalOverriding = totalOverriding;
	}
	String memberID2;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getUserloginPrimaryKeyString() {
		return userloginPrimaryKeyString;
	}
	public void setUserloginPrimaryKeyString(String userloginPrimaryKeyString) {
		this.userloginPrimaryKeyString = userloginPrimaryKeyString;
	}
	public int getUserLoginPrimaryKey() {
		return userLoginPrimaryKey;
	}
	public void setUserLoginPrimaryKey(int userLoginPrimaryKey) {
		this.userLoginPrimaryKey = userLoginPrimaryKey;
	}
	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	public double getMemberCommition() {
		return memberCommition;
	}
	public void setMemberCommition(double memberCommition) {
		this.memberCommition = memberCommition;
	}
	public double getMemberOvrriding() {
		return memberOvrriding;
	}
	public void setMemberOvrriding(double memberOvrriding) {
		this.memberOvrriding = memberOvrriding;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMemberID1() {
		return memberID1;
	}
	public void setMemberID1(String memberID1) {
		this.memberID1 = memberID1;
	}
	public String getMemberID2() {
		return memberID2;
	}
	public void setMemberID2(String memberID2) {
		this.memberID2 = memberID2;
	}
	
	
	
}
