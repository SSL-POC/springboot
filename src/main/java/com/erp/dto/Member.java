package com.erp.dto;

import java.io.Serializable;
import java.util.Date;

//import org.springframework.web.multipart.MultipartFile;

public class Member extends Common implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8114115119045429240L;
	String firstName;
	String lastName;
	int numberofUnit;
	//String username; //commanded and brought to super class
	//String password; //commanded and brought to super class
	String selectedCountry;
	String selectedState;
	String categoryname;
	String cname;
	String noofrooms;
	String noofchild;
	String noofadult;
	//String userloginPrimaryKeyString; //commanded and brought to super class
	//int userLoginPrimaryKey; //commanded and brought to super class	
	String phoneNumber;
	String emailID;
	//String status;
	// existing member ID
	String refmemberID;
	// New meber ID
	//String memberID; // commanded and brought to super class
	//String memberNumber; // commanded and brought to super class
	String bankName;//string;
	String  bankAcctNumber;//string;
	String actType; 
	int payAmt;
	double adminFees;
	double totalFees;
	// new member fild
	double commition;
	double overriding;	
	// referance1 member update filed
	int member1_primaryKey;
	double ref_commition1;
	double ref_ovrriding1;
	String Member_refer_Number1;	
	// referance2 member update filed
	int member2_primaryKey;
	double ref_commition2;
	double ref_ovrriding2;
	String Member_refer_Number2;	
	// referance 3 
	int member3_primaryKey;
	double ref_commition3;
	double ref_ovrriding3;	
	// addition	
	//sequance number and group name
	int sequanceNumber;
	int groupName;
	int leveNumber;
	String treeName;
	String bookingStatus;
	String invoiceNumber;	
	int noofTables;
	String airname;
	Date departure;
	Date returndate;
	String fromplace;
	String toplace;
	String noofpax;
	String triptype;
	Date bookingdate;
	String bookingtime;
	Date arrivaldate;
	String visitcountry;
	String category;
	String departurename;
	Date appointmentdate;
	String financialtime;
	String university;
	String study;
	String yearofstudy;
	String categoryinsurance;
	String companyinsurance;
	String hospitalname;
	String medicaltime;
	String treatment;
	String categoryproduct;
	String listproduct;
	double quantity;
	String companyname;
	String hotelImagePath;
	double totalAmount;
	int withdrawamt;
	
	//newly added
	
	int sNo;
	String description;		
	String categoryCode;	
	Date fromDate;
	Date toDate;
	String bookingCode;
	String price;
	String address;
	String cityName;
	String emailID1;
	String emailID2;
	String emailID3;	
	String bookingTime;
	String MemberID3;
	
	String adminbankName;
	String banktransfer;
	String adminacctNumber;
	String adminacctName;
	String transferAcctName;
	String transferBankAcctNumber;
	
	public int getNumberofUnit() {
		return numberofUnit;
	}
	public void setNumberofUnit(int numberofUnit) {
		this.numberofUnit = numberofUnit;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getWithdrawamt() {
		return withdrawamt;
	}
	public void setWithdrawamt(int withdrawamt) {
		this.withdrawamt = withdrawamt;
	}
	public String getHotelImagePath() {
		return hotelImagePath;
	}
	public void setHotelImagePath(String hotelImagePath) {
		this.hotelImagePath = hotelImagePath;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public int getLeveNumber() {
		return leveNumber;
	}
	public void setLeveNumber(int leveNumber) {
		this.leveNumber = leveNumber;
	}
	public String getTreeName() {
		return treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}
	/*public String getUserloginPrimaryKeyString() {
		return userloginPrimaryKeyString;
	}
	public void setUserloginPrimaryKeyString(String userloginPrimaryKeyString) {
		this.userloginPrimaryKeyString = userloginPrimaryKeyString;
	}*/
	public String getNoofrooms() {
		return noofrooms;
	}
	public void setNoofrooms(String noofrooms) {
		this.noofrooms = noofrooms;
	}
	public String getNoofchild() {
		return noofchild;
	}
	public void setNoofchild(String noofchild) {
		this.noofchild = noofchild;
	}
	public String getNoofadult() {
		return noofadult;
	}
	public void setNoofadult(String noofadult) {
		this.noofadult = noofadult;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getSelectedState() {
		return selectedState;
	}
	public void setSelectedState(String selectedState) {
		this.selectedState = selectedState;
	}
	/*public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}*/
	
	public double getRef_commition3() {
		return ref_commition3;
	}
	public void setRef_commition3(double ref_commition3) {
		this.ref_commition3 = ref_commition3;
	}
	public double getRef_ovrriding3() {
		return ref_ovrriding3;
	}
	public void setRef_ovrriding3(double ref_ovrriding3) {
		this.ref_ovrriding3 = ref_ovrriding3;
	}
	public int getMember3_primaryKey() {
		return member3_primaryKey;
	}
	public void setMember3_primaryKey(int member3_primaryKey) {
		this.member3_primaryKey = member3_primaryKey;
	}
	public int getMember1_primaryKey() {
		return member1_primaryKey;
	}
	public void setMember1_primaryKey(int member1_primaryKey) {
		this.member1_primaryKey = member1_primaryKey;
	}
	public int getMember2_primaryKey() {
		return member2_primaryKey;
	}
	public void setMember2_primaryKey(int member2_primaryKey) {
		this.member2_primaryKey = member2_primaryKey;
	}
	public int getSequanceNumber() {
		return sequanceNumber;
	}
	public void setSequanceNumber(int sequanceNumber) {
		this.sequanceNumber = sequanceNumber;
	}
	public int getGroupName() {
		return groupName;
	}
	public void setGroupName(int groupName) {
		this.groupName = groupName;
	}
	public String getMember_refer_Number1() {
		return Member_refer_Number1;
	}
	public void setMember_refer_Number1(String member_refer_Number1) {
		Member_refer_Number1 = member_refer_Number1;
	}
	public String getMember_refer_Number2() {
		return Member_refer_Number2;
	}
	public void setMember_refer_Number2(String member_refer_Number2) {
		Member_refer_Number2 = member_refer_Number2;
	}
	/*public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/*public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}*/
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/
	public String getCountry() {
		return selectedCountry;
	}
	public void setCountry(String country) {
		this.selectedCountry = country;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getRefmemberID() {
		return refmemberID;
	}
	public void setRefmemberID(String refmemberID) {
		this.refmemberID = refmemberID;
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
	public String getSelectedCountry() {
		return selectedCountry;
	}
	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	/*public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}*/
	public int getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(int payAmt) {
		this.payAmt = payAmt;
	}
	
	public double getCommition() {
		return commition;
	}
	public void setCommition(double commition) {
		this.commition = commition;
	}
	public double getOverriding() {
		return overriding;
	}
	public void setOverriding(double overriding) {
		this.overriding = overriding;
	}
	
	public double getRef_commition1() {
		return ref_commition1;
	}
	public void setRef_commition1(double ref_commition1) {
		this.ref_commition1 = ref_commition1;
	}
	public double getRef_ovrriding1() {
		return ref_ovrriding1;
	}
	public void setRef_ovrriding1(double ref_ovrriding1) {
		this.ref_ovrriding1 = ref_ovrriding1;
	}
	public double getRef_commition2() {
		return ref_commition2;
	}
	public void setRef_commition2(double ref_commition2) {
		this.ref_commition2 = ref_commition2;
	}
	public double getRef_ovrriding2() {
		return ref_ovrriding2;
	}
	public void setRef_ovrriding2(double ref_ovrriding2) {
		this.ref_ovrriding2 = ref_ovrriding2;
	}
	/*public int getUserLoginPrimaryKey() {
		return userLoginPrimaryKey;
	}
	public void setUserLoginPrimaryKey(int userLoginPrimaryKey) {
		this.userLoginPrimaryKey = userLoginPrimaryKey;
	}*/
	
	
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
	
	
	
	//String bookingTime;

	
/*	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}*/
	public String getDeparturename() {
		return departurename;
	}
	public void setDeparturename(String departurename) {
		this.departurename = departurename;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getBookingtime() {
		return bookingtime;
	}
	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}
	public String getAirname() {
		return airname;
	}
	public void setAirname(String airname) {
		this.airname = airname;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public String getFromplace() {
		return fromplace;
	}
	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}
	public String getToplace() {
		return toplace;
	}
	public void setToplace(String toplace) {
		this.toplace = toplace;
	}
	public String getNoofpax() {
		return noofpax;
	}
	public void setNoofpax(String noofpax) {
		this.noofpax = noofpax;
	}
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	public Date getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public String getVisitcountry() {
		return visitcountry;
	}
	public void setVisitcountry(String visitcountry) {
		this.visitcountry = visitcountry;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getFinancialtime() {
		return financialtime;
	}
	public void setFinancialtime(String financialtime) {
		this.financialtime = financialtime;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getYearofstudy() {
		return yearofstudy;
	}
	public void setYearofstudy(String yearofstudy) {
		this.yearofstudy = yearofstudy;
	}
	public String getCategoryinsurance() {
		return categoryinsurance;
	}
	public void setCategoryinsurance(String categoryinsurance) {
		this.categoryinsurance = categoryinsurance;
	}
	public String getCompanyinsurance() {
		return companyinsurance;
	}
	public void setCompanyinsurance(String companyinsurance) {
		this.companyinsurance = companyinsurance;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getMedicaltime() {
		return medicaltime;
	}
	public void setMedicaltime(String medicaltime) {
		this.medicaltime = medicaltime;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getCategoryproduct() {
		return categoryproduct;
	}
	public void setCategoryproduct(String categoryproduct) {
		this.categoryproduct = categoryproduct;
	}
	public String getListproduct() {
		return listproduct;
	}
	public void setListproduct(String listproduct) {
		this.listproduct = listproduct;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getNoofTables() {
		return noofTables;
	}
	public void setNoofTables(int noofTables) {
		this.noofTables = noofTables;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getEmailID1() {
		return emailID1;
	}
	public void setEmailID1(String emailID1) {
		this.emailID1 = emailID1;
	}
	public String getEmailID2() {
		return emailID2;
	}
	public void setEmailID2(String emailID2) {
		this.emailID2 = emailID2;
	}
	public String getEmailID3() {
		return emailID3;
	}
	public void setEmailID3(String emailID3) {
		this.emailID3 = emailID3;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getMemberID3() {
		return MemberID3;
	}
	public void setMemberID3(String memberID3) {
		MemberID3 = memberID3;
	}
	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getBanktransfer() {
		return banktransfer;
	}
	public void setBanktransfer(String banktransfer) {
		this.banktransfer = banktransfer;
	}
	public String getAdminacctNumber() {
		return adminacctNumber;
	}
	public void setAdminacctNumber(String adminacctNumber) {
		this.adminacctNumber = adminacctNumber;
	}
	public String getAdminacctName() {
		return adminacctName;
	}
	public void setAdminacctName(String adminacctName) {
		this.adminacctName = adminacctName;
	}
	public String getAdminbankName() {
		return adminbankName;
	}
	public void setAdminbankName(String adminbankName) {
		this.adminbankName = adminbankName;
	}
	public String getTransferAcctName() {
		return transferAcctName;
	}
	public void setTransferAcctName(String transferAcctName) {
		this.transferAcctName = transferAcctName;
	}
	public String getTransferBankAcctNumber() {
		return transferBankAcctNumber;
	}
	public void setTransferBankAcctNumber(String transferBankAcctNumber) {
		this.transferBankAcctNumber = transferBankAcctNumber;
	}
	
	
	

}
