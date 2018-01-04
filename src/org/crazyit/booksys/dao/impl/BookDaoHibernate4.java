package org.crazyit.booksys.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.crazyit.booksys.dao.BookDao;
import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.common.dao.impl.BaseDaoHibernate4;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BookDaoHibernate4 extends BaseDaoHibernate4<Book> implements
		BookDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getSession(){
		return this.sessionFactory.openSession();
	}
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	
	@Override
	public int Save(Book book) {
		return (int)getSession().save(book);
	}
	
	public Book get(int id) {
		return (Book)getSession().get(Book.class,id);
	}
	
	public void update(Book book) {
		getSessionFactory().getCurrentSession().saveOrUpdate(book);
	}
	
	public List<Book> getAllBooks(){
		return find("select en from " + Book.class.getSimpleName() + " en");
	}
	
	public void delete(int id){
		getSession()
		.createQuery(
				"delete " + Book.class.getSimpleName()
						+ " en where en.id = ?0").setParameter("0", id)
		.executeUpdate();
	}
	protected List<Book> find(String hql) {
		return (List<Book>) getSession()
				.createQuery(hql).list();
	}
	
}
