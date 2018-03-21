package com.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entity.User;

public class UserDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void add(User user){
		hibernateTemplate.save(user);
	}
	
	public void delete(User user){
		hibernateTemplate.delete(user);
	}

}
