package com.erp.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_role_type database table.
 * 
 */
@Entity
@Table(name="user_role_type")
@NamedQuery(name="UserRoleType.findAll", query="SELECT u FROM UserRoleType u")
public class UserRoleType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_Role_ID;

	@Column(name="User_Role_Name")
	private String user_Role_Name;

	public UserRoleType() {
	}

	public int getUser_Role_ID() {
		return this.user_Role_ID;
	}

	public void setUser_Role_ID(int user_Role_ID) {
		this.user_Role_ID = user_Role_ID;
	}

	public String getUser_Role_Name() {
		return this.user_Role_Name;
	}

	public void setUser_Role_Name(String user_Role_Name) {
		this.user_Role_Name = user_Role_Name;
	}

}