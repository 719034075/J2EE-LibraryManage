package org.crazyit.booksys.dao;

import org.crazyit.booksys.domain.User;
import org.crazyit.common.dao.BaseDao;
import org.springframework.stereotype.Repository;


public interface UserDao extends BaseDao<User>  {
	public void Save(User user);
	public User getUser(String name);
	public User getUser(String name,String password);
	public User geyUserById(Integer id);
}
