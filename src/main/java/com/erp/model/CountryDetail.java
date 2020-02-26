package com.erp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country_details database table.
 * 
 */
@Entity
@Table(name="country_details_master")
@NamedQuery(name="CountryDetail.findAll", query="SELECT c FROM CountryDetail c")
public class CountryDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int country_ID;

	@Column(name="country_name")
	private String countryName;
	
	@Column(name="state_name")
	private String state_name;
	

	public CountryDetail() {
	}

	public int getCountry_ID() {
		return this.country_ID;
	}

	public void setCountry_ID(int country_ID) {
		this.country_ID = country_ID;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	
	

}