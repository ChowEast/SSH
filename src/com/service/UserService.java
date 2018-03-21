package com.service;

import com.dao.UserDao;
import com.entity.User;

public class UserService {
	private UserDao userDao;
     public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(User user){
    	 userDao.add(user);
     }
}
