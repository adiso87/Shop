package com.jelastic.adiso87.Shop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
		@NamedQuery(name = "findProductsByCategory", 
				query = "SELECT p FROM ProductEntity p WHERE p.category = :category"),
				
		@NamedQuery(name = "findAllProducts", 
				query = "SELECT p FROM ProductEntity p"),
		@NamedQuery(name = "findProductsByCategoryName",
				query="SELECT p FROM ProductEntity p WHERE p.category.name = :categoryName")})
@Entity
@Table(name = "PRODUCTS")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 860914268933713021L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRODUCER")
	private String producer;

	@Column(name = "SHORT_DESC")
	private String shortDescription;

	@Column(name = "LONG_DESC")
	private String longDescription;

	@Column(name = "PRICE")
	private double price;

	@ManyToOne(optional=false)
	@JoinColumn(name="CATEGORY_ID", nullable=false, updatable=false)
	CategoryEntity category;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
