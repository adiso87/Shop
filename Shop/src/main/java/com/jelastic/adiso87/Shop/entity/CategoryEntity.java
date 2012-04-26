package com.jelastic.adiso87.Shop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({@NamedQuery(name="findAllCategories",query="SELECT c FROM CategoryEntity c "),
				@NamedQuery(name="findCategoryByName", query="SELECT c FROM CategoryEntity c WHERE c.name = :name")})

@Entity
@Table(name="CATEGORIES")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 4383653690537377851L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String toString(){
		return name;
	}
	

}
