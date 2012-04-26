package com.jelastic.adiso87.Shop.dao.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> type;
	
	@SuppressWarnings("unchecked")
	public GenericDaoImpl(){
		
		Type t =getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Transactional
	@Override
	public T create(final T t){
		this.em.persist(t);
		return t;
	}
	@Transactional
	@Override
    public void remove(final Object id) {
        this.em.remove(this.em.getReference(type, id));
    }

	@Transactional
    @Override
    public T find(final Object id) {
        return (T) this.em.find(type, id);
    }

	@Transactional
    @Override
    public T update(final T t) {
        return this.em.merge(t);    
    }
	

}
