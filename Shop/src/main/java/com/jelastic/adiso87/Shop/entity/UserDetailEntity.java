package com.jelastic.adiso87.Shop.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
		@NamedQuery(name = "findAllUsers", query = "SELECT u FROM UserDetailEntity u"),
		@NamedQuery(name = "findUserByUserName", query = "SELECT u FROM UserDetailEntity u WHERE u.userName = :userName") })
@Entity
@Table(name = "USER_DETAILS")
public class UserDetailEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "CITY")
	private String city;

	@Column(name = "POSTAL_CODE")
	private String postalCode;
	
	public UserDetailEntity(){
		orders = new ArrayList<OrderEntity>();
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_DETAILS_ORDERS", joinColumns = @JoinColumn(name = "USER_DETAILS_ID"), inverseJoinColumns = @JoinColumn(name = "ORDERS_ID"))
	private List<OrderEntity> orders;

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
