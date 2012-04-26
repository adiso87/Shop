package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jelastic.adiso87.Shop.dao.generic.GenericDaoImpl;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;
import com.jelastic.adiso87.Shop.entity.ProductEntity;

@Component("productDao")
public class ProductDaoImpl extends GenericDaoImpl<ProductEntity> implements ProductDao{

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<ProductEntity> findAllProducts() {
		return em.createNamedQuery("findAllProducts").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<ProductEntity> findProductsByCategory(CategoryEntity category) {
		Query query = em.createNamedQuery("findProductsByCategory");
		query.setParameter("category",category);
		return (List<ProductEntity>) query.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<ProductEntity> findProductsByCategoryName(String categoryName) {
		Query query = em.createNamedQuery("findProductsByCategoryName");
		query.setParameter("categoryName",categoryName);
		return (List<ProductEntity>) query.getResultList();
	}

	

	
	
	}


