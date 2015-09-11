package com.hand.service;

import java.io.Serializable;

import com.hand.model.User;

public interface UserServiceI {
	void test();
	/**
      * 保存用户
      * @param user
      * @return
      */
     Serializable save(User user); 
}
