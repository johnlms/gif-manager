package com.company.gifmanager.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.gifmanager.db.model.User;

public class UserManager {
	private final Logger log = LoggerFactory.getLogger(getClass());

	// Register User
	public void registerUser(User user, String password) {
		log.debug("register user[{}]", user);
	}
	
	// Authenticate User
	public void authenticateUser(String user, String password) {
		log.debug("authenticate user[{}]", user);
	}
	
	// Update User Information
	public void updateUser(Integer id, User user) {
		log.debug("update user information[{}][{}]", id, user);
	}
	
	// Change user password
	public void changePassword(Integer id, String oldPassword, String newPassword) {
		log.debug("change user password[{}]", id);
	}
	
	// Remove User
	public void removeUser(Integer id) {
		log.debug("remove user[{}]", id);
	}
	
	// Get User Information
	public void getUserInformation(Integer id) {
		log.debug("get user information[{}]", id);
	}
	
}
