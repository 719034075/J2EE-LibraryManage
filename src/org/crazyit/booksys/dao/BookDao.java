package org.crazyit.booksys.dao;

import java.io.Serializable;
import java.util.List;

import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.common.dao.BaseDao;

public interface BookDao extends BaseDao<Book> {
	void delete(int id);
	
	int Save(Book book);
	
	Book get(int id);
	
	void update(Book book);
	
	List<Book> getAllBooks();
	
}
