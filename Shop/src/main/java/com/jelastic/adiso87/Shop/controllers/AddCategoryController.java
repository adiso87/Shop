package com.jelastic.adiso87.Shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jelastic.adiso87.Shop.dao.CategoryDao;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;


@Component("addCategory")
@Scope("request")
public class AddCategoryController {
	
	@Autowired
	CategoryDao categoryDao;
	
	private CategoryEntity category;
	
	public AddCategoryController() {
		category=new CategoryEntity();
	}
	public void setName(String name){
		category.setName(name);
	}
	public String getName(){
		return category.getName();
	}
	public String add(){
		categoryDao.create(category);
		return "success";
	}
}
