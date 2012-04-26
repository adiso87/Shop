package com.jelastic.adiso87.Shop.dao.generic;

public interface GenericDao<T> {

	T create(T t);
	void remove(Object id);
	T find (T t);
	T update (T t);
	
}
