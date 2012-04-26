package com.jelastic.adiso87.Shop.dao;

import java.util.List;

import com.jelastic.adiso87.Shop.dao.generic.GenericDao;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;
import com.jelastic.adiso87.Shop.entity.ProductEntity;

public interface ProductDao extends GenericDao<ProductEntity> {
	public List<ProductEntity> findAllProducts();
	public List<ProductEntity> findProductsByCategory(CategoryEntity category);
	public List<ProductEntity> findProductsByCategoryName(String categoryName);
}
