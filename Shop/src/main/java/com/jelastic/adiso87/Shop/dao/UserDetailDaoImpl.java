package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jelastic.adiso87.Shop.dao.generic.GenericDaoImpl;
import com.jelastic.adiso87.Shop.entity.UserDetailEntity;

@Component("userDetailDao")
public class UserDetailDaoImpl extends GenericDaoImpl<UserDetailEntity> implements UserDetailDao {
	
	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetailEntity> findAllUsers() {
		return (List<UserDetailEntity>) em.createNamedQuery("findAllUsers")
		.getResultList();
		
	}
	@Transactional
	@Override
	public UserDetailEntity findUserByUserName(String userName) {
		Query query = em.createNamedQuery("findUserByUserName");
		query.setParameter("userName", userName);
		return null;
	}
}
