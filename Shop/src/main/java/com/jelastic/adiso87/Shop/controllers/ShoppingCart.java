package com.jelastic.adiso87.Shop.controllers;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jelastic.adiso87.Shop.entity.ProductEntity;
import com.jelastic.adiso87.Shop.entity.UserDetailEntity;

@Component("shoppingCart")
@Scope("session")
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private UserDetailEntity owner;
	private List<ProductEntity> stuff;
	
	public void add(ProductEntity pe){
		stuff.add(pe);
	}
	
	public void remove(ProductEntity pe){
		stuff.remove(pe);
	}
	public int getCount(){
		return stuff.size();
	}
	public String buy(){
		return "hahaa";
	}
		
	//SETTERS AND GETTERS
	public UserDetailEntity getOwner() {
		return owner;
	}
	public void setOwner(UserDetailEntity owner) {
		this.owner = owner;
	}
	public List<ProductEntity> getStuff() {
		return stuff;
	}
	public void setStuff(List<ProductEntity> stuff) {
		this.stuff = stuff;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
