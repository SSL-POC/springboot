package com.erp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the industry_details database table.
 * 
 */
@Entity
@Table(name="industry_details_master")
@NamedQuery(name="IndustryDetail.findAll", query="SELECT i FROM IndustryDetail i")
public class IndustryDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int industry_ID;

	@Column(name="country_name")
	private String countryName;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="industry_name")
	private String industryName;

	@Column(name="company_name")
	private String companyName;	

	@Column(name="discount")
	private String discount;


	public IndustryDetail() {
	}

	public int getIndustry_ID() {
		return this.industry_ID;
	}

	public void setIndustry_ID(int industry_ID) {
		this.industry_ID = industry_ID;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}