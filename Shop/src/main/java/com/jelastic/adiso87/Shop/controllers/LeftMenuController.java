package com.jelastic.adiso87.Shop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jelastic.adiso87.Shop.dao.CategoryDao;
import com.jelastic.adiso87.Shop.entity.CategoryEntity;

@Component("leftMenu")
public class LeftMenuController {
	
	@Autowired
	private CategoryDao categoryDao;
	
	public List<CategoryEntity> getAllCategories(){
		return categoryDao.findAllCategories();
	}
}
