package com.erp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the randam_number database table.
 * 
 */
@Entity
@Table(name="randam_number")
@NamedQuery(name="RandamNumber.findAll", query="SELECT r FROM RandamNumber r")
public class RandamNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int temp_ID;

	
	@Column(name="Member_Code")
	private String member_Code;
	
	@Column(name="Current_Member_Number")
	private int current_Member_Number;

	@Column(name="Current_Group_Number")
	private int Current_Group_Number;

	@Column(name="treeRandamNumber")
	private int treeRandamNumber;

	@Column(name="booking_Randam_Number")
	private int booking_Randam_Number;
	
	@Column(name="category_Randam_Number")
	private int category_Randam_Number;


	public RandamNumber() {
	}

	public int getTemp_ID() {
		return this.temp_ID;
	}

	public void setTemp_ID(int temp_ID) {
		this.temp_ID = temp_ID;
	}

	public int getCurrent_Member_Number() {
		return this.current_Member_Number;
	}

	public void setCurrent_Member_Number(int current_Member_Number) {
		this.current_Member_Number = current_Member_Number;
	}

	public String getMember_Code() {
		return this.member_Code;
	}

	public void setMember_Code(String member_Code) {
		this.member_Code = member_Code;
	}

	public int getCurrent_Group_Number() {
		return Current_Group_Number;
	}

	public void setCurrent_Group_Number(int current_Group_Number) {
		Current_Group_Number = current_Group_Number;
	}

	public int getTreeRandamNumber() {
		return treeRandamNumber;
	}

	public void setTreeRandamNumber(int treeRandamNumber) {
		this.treeRandamNumber = treeRandamNumber;
	}

	public int getBooking_Randam_Number() {
		return booking_Randam_Number;
	}

	public void setBooking_Randam_Number(int booking_Randam_Number) {
		this.booking_Randam_Number = booking_Randam_Number;
	}

	public int getCategory_Randam_Number() {
		return category_Randam_Number;
	}

	public void setCategory_Randam_Number(int category_Randam_Number) {
		this.category_Randam_Number = category_Randam_Number;
	}
	
	

}