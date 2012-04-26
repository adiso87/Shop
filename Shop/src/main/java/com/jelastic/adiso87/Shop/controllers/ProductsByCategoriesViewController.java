package com.jelastic.adiso87.Shop.controllers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jelastic.adiso87.Shop.entity.ProductEntity;

@Component("productsByCategoriesView")
public class ProductsByCategoriesViewController {
	
	public ProductsByCategoriesViewController() {}
	private List<ProductEntity> products;
	
	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}


}
