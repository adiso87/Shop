package com.jelastic.adiso87.Shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jelastic.adiso87.Shop.dao.UserDetailDao;
import com.jelastic.adiso87.Shop.entity.UserDetailEntity;

@Service("usersView")
@Scope("request")
public class UsersViewController {
	@Autowired
	UserDetailDao userDetailDao;

	public UsersViewController() {

	}

	public List<UserDetailEntity>getAllUsers(){
		return userDetailDao.findAllUsers();
	}
}
