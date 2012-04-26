package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import com.jelastic.adiso87.Shop.dao.generic.GenericDao;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;

public interface CategoryDao extends GenericDao<CategoryEntity> {
	public List<CategoryEntity> findAllCategories();
	public CategoryEntity findCategoryByName(String name);
}
