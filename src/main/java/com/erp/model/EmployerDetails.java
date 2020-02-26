package com.erp.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the user_details database table.
 * 
 */
@Entity
@Table(name="employer_details")
@NamedQuery(name="EmployerDetails.findAll", query="SELECT ed FROM EmployerDetails ed")
public class EmployerDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employer_Details_ID;

	@Column(name="Employer_name")
	private String Employer_name;

	@Column(name="Employer_phoneNumber")
	private String Employer_phoneNumber;

	@Column(name="Employer_emailID")
	private String Employer_emailID;
	
	@Column(name="Employer_password")
	private String Employer_password;
	
	@Column(name="Employer_country")
	private String Employer_country;	

	@Column(name="Employer_status")
	private String Employer_status;
	
	
	
	
	

	public EmployerDetails() {
	}

	

	public int getEmployer_Details_ID() {
		return employer_Details_ID;
	}

	public void setEmployer_Details_ID(int employer_Details_ID) {
		this.employer_Details_ID = employer_Details_ID;
	}

	
	
	public String getEmployer_name() {
		return Employer_name;
	}



	public void setEmployer_name(String employer_name) {
		Employer_name = employer_name;
	}



	public String getEmployer_phoneNumber() {
		return Employer_phoneNumber;
	}



	public void setEmployer_phoneNumber(String employer_phoneNumber) {
		Employer_phoneNumber = employer_phoneNumber;
	}



	public String getEmployer_emailID() {
		return Employer_emailID;
	}



	public void setEmployer_emailID(String employer_emailID) {
		Employer_emailID = employer_emailID;
	}



	public String getEmployer_password() {
		return Employer_password;
	}



	public void setEmployer_password(String employer_password) {
		Employer_password = employer_password;
	}



	public String getEmployer_country() {
		return Employer_country;
	}



	public void setEmployer_country(String employer_country) {
		Employer_country = employer_country;
	}



	public String getEmployer_status() {
		return Employer_status;
	}

	public void setEmployer_status(String employer_status) {
		Employer_status = employer_status;
	}


	
	
	
	
}