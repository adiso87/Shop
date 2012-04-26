package com.jelastic.adiso87.Shop.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ORDERS")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="COST")
	private double cost;
	
	@Column(name="DATE")
	private Timestamp date;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ORDERS_PRODUCTS",
	joinColumns=@JoinColumn(name="ORDERS_ID"),
	inverseJoinColumns=@JoinColumn(name="products_PRODUCT_ID"))
	private Collection<ProductEntity> products;
	
	public OrderEntity(){
		products = new ArrayList<ProductEntity>();
	}
	
	public Collection<ProductEntity> getProducts() {
		return products;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
