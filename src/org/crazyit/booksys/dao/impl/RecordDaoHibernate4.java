package org.crazyit.booksys.dao.impl;

import java.util.LinkedList;
import java.util.List;

import org.crazyit.booksys.dao.RecordDao;
import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.booksys.domain.User;
import org.crazyit.common.dao.impl.BaseDaoHibernate4;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RecordDaoHibernate4 extends BaseDaoHibernate4<Record> implements RecordDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	
	public Session getSession(){
		return this.sessionFactory.openSession();
	}
	
	public Record get(int id) {
		return (Record)getSession().get(Record.class,id);
	}
	
	@Override
	public void delete(int id){
		getSession()
		.createQuery(
				"delete " + Record.class.getSimpleName()
						+ " en where en.id = ?0").setParameter("0", id)
		.executeUpdate();
	}
	
	@Override
	public void Save(Record record) {
		getSession().save(record);
	}
	
	@Override
	public List<Record> findAll(){
		String hql="from Record r";
		Query query=getSession().createQuery(hql);
		List<Record> list=query.list();
		List<Record> records=new LinkedList<Record>() ;
		if(list.size()!=0){
			for (Record record:list){
				String bookhql="from Book b where id=?";
				Query bookquery=getSession().createQuery(bookhql);
				bookquery.setString(0,String.valueOf(record.getBook_id()));
				List<Book> books=bookquery.list();
				if(books.size()!=0){
					Book book=(Book)books.get(0);
					record.setBook_name(book.getName());
				}
				
				String userhql="from User u where id=?";
				Query userquery=getSession().createQuery(userhql);
				userquery.setString(0,String.valueOf(record.getUser_id()));
				List<User> users=userquery.list();
				if(users.size()!=0){
					User user=(User)users.get(0);
					record.setUser_name(user.getName());
				}
				records.add(record);
			}
			return records;
		}
		return null;
	}
	
	public void update(Record record) {
		getSessionFactory().getCurrentSession().saveOrUpdate(record);
	}
	
	@Override
	public List<Record> getRecordsByBookId(int book_id){
		String hql="from Record r where book_id=?";
		
		Query query=getSession().createQuery(hql);
		query.setString(0,String.valueOf(book_id));
		List<Record> list=query.list();
		List<Record> records=new LinkedList<Record>() ;
		if(list.size()!=0){
			for (Record record:list){
				String bookhql="from Book b where id=?";
				Query bookquery=getSession().createQuery(bookhql);
				bookquery.setString(0,String.valueOf(record.getBook_id()));
				List<Book> books=bookquery.list();
				if(books.size()!=0){
					Book book=(Book)books.get(0);
					record.setBook_name(book.getName());
				}
				
				String userhql="from User u where id=?";
				Query userquery=getSession().createQuery(userhql);
				userquery.setString(0,String.valueOf(record.getUser_id()));
				List<User> users=userquery.list();
				if(users.size()!=0){
					User user=(User)users.get(0);
					record.setUser_name(user.getName());
				}
				records.add(record);
			}
		
			
			return records;
		}
		return null;
	}
	
	@Override
	public List<Record> getRecordsByUserId(int user_id){
		String hql="from Record r where user_id=?";
		
		Query query=getSession().createQuery(hql);
		query.setString(0,String.valueOf(user_id));
		List<Record> list=query.list();
		List<Record> records=new LinkedList<Record>() ;
		if(list.size()!=0){
			for (Record record:list){
				String bookhql="from Book b where id=?";
				Query bookquery=getSession().createQuery(bookhql);
				bookquery.setString(0,String.valueOf(record.getBook_id()));
				List<Book> books=bookquery.list();
				if(books.size()!=0){
					Book book=(Book)books.get(0);
					record.setBook_name(book.getName());
				}
				
				String userhql="from User u where id=?";
				Query userquery=getSession().createQuery(userhql);
				userquery.setString(0,String.valueOf(record.getUser_id()));
				List<User> users=userquery.list();
				if(users.size()!=0){
					User user=(User)users.get(0);
					record.setUser_name(user.getName());
				}
				records.add(record);
			}
		
			
			return records;
		}
		return null;
	}
}
