package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.entity.User;

public class TestUser {

	@Test
	public void test() {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		tr.begin();
		
		//游离态
		User user = new User();
		
		//user.setId(28);
		user.setName("1111");
		user.setPhone("1111");
		user.setEmail("1111");
		//游离态结束
		///////////////////////
		session.save(user);
		//持久态
		tr.commit();
		session.close();
		sessionFactory.close();
	}

}
