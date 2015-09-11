package com.hand.dao;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.hand.model.User;
@Component
public interface UserDao {
	 /**
      * 保存用户
      * @param user
      * @return
      */
     Serializable save(User user); 
}
