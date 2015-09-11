package com.hand.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hand.dao.UserDao;
import com.hand.model.User;
import com.hand.service.UserServiceI;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired()
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;


	public Serializable save(User user) {
		return sessionFactory.getCurrentSession().save(user);
		
	}

}
