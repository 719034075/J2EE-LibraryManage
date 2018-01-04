package org.crazyit.booksys.service.impl;

import org.crazyit.booksys.dao.UserDao;
import org.crazyit.booksys.domain.User;
import org.crazyit.booksys.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	
	@Override
	public boolean register(User user) {
		User thisUser=this.userDao.getUser(user.getName());
		if(thisUser!=null){
			return false;
		}
		this.userDao.Save(user);
		return true;
	}
	
	@Override
	public User login(String name, String password) {
		return this.userDao.getUser(name, password);
	}
	
	@Override
	public User getUserById(Integer id) {
		return userDao.geyUserById(id);
	}
}
