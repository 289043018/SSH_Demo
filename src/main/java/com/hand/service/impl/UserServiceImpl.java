package com.hand.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.UserDao;
import com.hand.model.User;
import com.hand.service.UserServiceI;
//使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	/**
      * 注入userDao
      */
     @Autowired
     private UserDao userDao;
	
	public void test() {
		System.out.println("Hello World!");

	}

	public Serializable save(User user) {
	
		return userDao.save(user);
	}

}
