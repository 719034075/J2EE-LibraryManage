package org.crazyit.booksys.dao.impl;

import java.util.List;

import org.crazyit.booksys.dao.UserDao;
import org.crazyit.booksys.domain.User;
import org.crazyit.common.dao.impl.BaseDaoHibernate4;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoHibernate4 extends BaseDaoHibernate4<User> implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getSession(){
		return this.sessionFactory.openSession();
	}
	
	public void Save(User user) {
		getSession().save(user);
	}

	public User getUser(String name) {
		
		String hql="from User u  where name=?";
			
		Query query=getSession().createQuery(hql);
		query.setString(0,name);
		List list=query.list();
		
		if(list.size()!=0){
			User user=(User)list.get(0);
			return user;
		}
		return null;
	}
	
	public User getUser(String name, String password) {
		
		String hql="from User u  where name=? and password=?";
			
		Query query=getSession().createQuery(hql);
		query.setString(0,name);
		query.setString(1, password);
		List list=query.list();
		
		if(list.size()!=0){
			User user=(User)list.get(0);
			return user;
		}
		return null;
	}

	
	public User geyUserById(Integer id) {
		return (User)getSession().get(User.class, id);
	}

}
