package com.company.gifmanager.db.model;

import java.util.Date;

/**
 * Model class for user information.
 * @author johnl
 */
public class User {
	private Integer id;
	private String userName;
	private String password;
	private Date birthDate;
	private String email;
	private String name;
	
	
	// Setters/Getters for pojo objects.
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}
