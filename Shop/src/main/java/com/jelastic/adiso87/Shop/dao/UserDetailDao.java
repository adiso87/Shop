package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import com.jelastic.adiso87.Shop.dao.generic.GenericDao;
import com.jelastic.adiso87.Shop.entity.UserDetailEntity;

public interface UserDetailDao extends GenericDao<UserDetailEntity> {
	
	public List<UserDetailEntity> findAllUsers();
	public UserDetailEntity findUserByUserName(String userName);
}
