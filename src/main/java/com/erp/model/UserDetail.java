package com.erp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="user_details")
@NamedQuery(name="UserDetail.findAll", query="SELECT u FROM UserDetail u")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_Details_ID;

	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;

	@Column(name="email1")
	private String email1;

	@Column(name="phonenumber1")
	private String phonenumber1;
	
	@Column(name="country")
	private String country;
	
	@Column(name="bankName")
	private String bankName;	

	@Column(name="bankAcctNumber")
	private String bankAcctNumber;

	@Column(name="memberID")
	private String memberID;

	@Column(name="member_Ref_ID")
	private String member_Ref_ID;
	
	
	@Column(name="acctType")
	private String acctType;

	@Column(name="payStatus")
	private String payStatus;
	
	@Column(name="payAmt")
	private int payAmt;
	
	@Column(name="acctCreated_date")
	private Date acctCreated_date;
	
	@Column(name="acct_Approved_date")
	private Date acct_Approved_date;
	
	@Column(name="adminFees")
	private double adminFees;
	
	@Column(name="totalFees")
	private double totalFees;
	
	
	
	
	//bi-directional many-to-one association to UserLogin
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="User_Login_ID")
	private UserLogin userLogin;

	public UserDetail() {
	}

	public int getUser_Details_ID() {
		return this.user_Details_ID;
	}

	public void setUser_Details_ID(int user_Details_ID) {
		this.user_Details_ID = user_Details_ID;
	}

	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPhonenumber1() {
		return this.phonenumber1;
	}

	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAcctNumber() {
		return bankAcctNumber;
	}

	public void setBankAcctNumber(String bankAcctNumber) {
		this.bankAcctNumber = bankAcctNumber;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMember_Ref_ID() {
		return member_Ref_ID;
	}

	public void setMember_Ref_ID(String member_Ref_ID) {
		this.member_Ref_ID = member_Ref_ID;
	}

	
	public UserLogin getUserLogin() {
		return userLogin;
	}
	
	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public int getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(int payAmt) {
		this.payAmt = payAmt;
	}

	public Date getAcctCreated_date() {
		return acctCreated_date;
	}

	public void setAcctCreated_date(Date acctCreated_date) {
		this.acctCreated_date = acctCreated_date;
	}

	public Date getAcct_Approved_date() {
		return acct_Approved_date;
	}

	public void setAcct_Approved_date(Date acct_Approved_date) {
		this.acct_Approved_date = acct_Approved_date;
	}
	
	
	

	public double getAdminFees() {
		return adminFees;
	}

	public void setAdminFees(double adminFees) {
		this.adminFees = adminFees;
	}

	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

	
}