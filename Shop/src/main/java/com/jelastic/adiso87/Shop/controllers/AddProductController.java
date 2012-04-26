package com.jelastic.adiso87.Shop.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.jelastic.adiso87.Shop.dao.CategoryDao;
import com.jelastic.adiso87.Shop.dao.ProductDao;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;
import com.jelastic.adiso87.Shop.entity.ProductEntity;


@Service("addProduct")
@Scope("request")
public class AddProductController {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	private String categoryString; 
	
	public String getCategoryString() {
		return categoryString;
	}

	public void setCategoryString(String categoryString) {
		this.categoryString = categoryString;
	}

	private List<CategoryEntity> categoryList; 
	
	private ProductEntity product;
	
	public AddProductController(){
		product = new ProductEntity();
		
	}
	
	@PostConstruct
	public void init(){
		categoryList = categoryDao.findAllCategories();
	}
	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	public void setCategory(String categoryName){
		
	}
	public CategoryEntity getCategory(){
		return null;
	}
	public String add(){
		for(CategoryEntity c : categoryList){
			if(c.getName().equals(categoryString))
				product.setCategory(c);
		}
		productDao.create(product);
		return "success";
	}

	public List<String> getCategoryStringList(){
		List<String> categoryStringList = new ArrayList<String>();
		for(CategoryEntity ce : categoryList){
			categoryStringList.add(ce.getName());
		}
		
		return categoryStringList;
	}
	
}
