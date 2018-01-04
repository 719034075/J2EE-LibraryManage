package org.crazyit.booksys.service.impl;

import java.util.List;

import org.crazyit.booksys.dao.BookDao;
import org.crazyit.booksys.dao.RecordDao;
import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.booksys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	
	@Autowired
	private RecordDao recordDao; 
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}

	@Override
	public int addBook(Book book) {
		return (Integer) bookDao.Save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public boolean borrowBook(int book_id,int user_id){
		Book book=bookDao.get(book_id);
		Record record=new Record();
		if(book.getAllowance()>=1){
			book.setAllowance(book.getAllowance()-1);
			bookDao.update(book);
		}else{
			return false;
		}
		record.setBook_id(book_id);
		record.setUser_id(user_id);
		record.setCategory("B");
		recordDao.Save(record);
		return true;
	}
	
	@Override
	public void deleteBook(int id) {
		List<Record> list=recordDao.getRecordsByBookId(id);
		if(list!=null){
			for (Record record:list){
				recordDao.delete(record.getId());
			}
		}
		bookDao.delete(id);
	}
}
