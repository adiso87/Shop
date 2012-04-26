package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import javax.persistence.Query;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jelastic.adiso87.Shop.dao.generic.GenericDaoImpl;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;

@Component("categoryDao")
public class CategoryDaoImpl extends GenericDaoImpl<CategoryEntity> implements CategoryDao {

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<CategoryEntity> findAllCategories() {
		return em.createNamedQuery("findAllCategories").getResultList();
	}

	@Transactional
	@Override
	public CategoryEntity findCategoryByName(String name) {
		Query query = em.createNamedQuery("findCategoryByName");
		query.setParameter("name", name);
		System.out.println("find category by name size: "+ query.getResultList().size());
		return (CategoryEntity) query.getResultList().get(0);
	}
	
}
