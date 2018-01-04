package org.crazyit.booksys.service;

import java.util.List;

import org.crazyit.booksys.domain.User;

public interface UserService {

	public boolean register(User user);

	public User login(String name,String password);
	
	public User getUserById(Integer id);
}
