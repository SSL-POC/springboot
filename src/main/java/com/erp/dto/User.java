package com.erp.dto;

import java.io.Serializable;

public class User extends Common implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7708020060604076755L;
	int id;
	String status; // return status
	String userRole;	
	String email_ID;
	String otp;
    String accoutType;
    String paymentPath;

    
   // @NotBlank(message = "username can't empty!")
   /* String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/
    

	public String getAccoutType() {
		return accoutType;
	}
	public void setAccoutType(String accoutType) {
		this.accoutType = accoutType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getPaymentPath() {
		return paymentPath;
	}
	public void setPaymentPath(String paymentPath) {
		this.paymentPath = paymentPath;
	}
	
	

	
	

}
