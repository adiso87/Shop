package com.jelastic.adiso87.Shop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jelastic.adiso87.Shop.dao.UserDetailDao;
import com.jelastic.adiso87.Shop.entity.UserDetailEntity;

@Service("registration")
public class RegistrationController {
	UserDetailEntity userDetail = null;

	@Autowired
	UserDetailDao userDetailDao;

	public RegistrationController() {

		this.userDetail = new UserDetailEntity();
	}

	public void setUserName(String userName) {
		userDetail.setUserName(userName);
	}

	public void setPassword(String pass) {
		userDetail.setPassword(pass);
	}

	public void setFirstName(String firstName) {
		userDetail.setFirstName(firstName);
	}

	public void setLastName(String lastName) {
		userDetail.setLastName(lastName);
	}

	public void setEmail(String email) {
		userDetail.setEmail(email);
	}

	public void setPhone(String phone) {
		userDetail.setPhone(phone);
	}

	public void setCity(String city) {
		userDetail.setCity(city);
	}

	public void setPostalCode(String postalCode) {
		userDetail.setPostalCode(postalCode);
	}
	
	public String register(){
		userDetailDao.create(userDetail);
		return "success";
	}

	public String getUserName() {
		return null;
	}

	public String getPassword() {
		return null;
	}

	public String getFirstName() {
		return null;
	}

	public String getLastName() {
		return null;
	}

	public String getEmail() {
		return null;
	}

	public String getPhone() {
		return null;
	}

	public String getCity() {
		return null;
	}

	public String getPostalCode() {
		return null;
	}
	public String getRegister(){
		return null;
	}
	public String save() {
		return null;
	}
}
