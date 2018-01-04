package org.crazyit.booksys.service.impl;

import java.util.List;

import org.crazyit.booksys.dao.BookDao;
import org.crazyit.booksys.dao.RecordDao;
import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.booksys.service.RecordService;

public class RecordServiceImpl implements RecordService {
	private RecordDao recordDao;
	private BookDao bookDao;
	
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public int addRecord(Record record) {
		return (Integer) recordDao.save(record);
	}

	@Override
	public List<Record> getAllRecords() {
		return recordDao.findAll();
	}
	
	@Override
	public void returnBook(int id){
		Record record=recordDao.get(id);
		Book book=bookDao.get(record.getBook_id());
		record.setCategory("R");
		book.setAllowance(book.getAllowance()+1);
		recordDao.update(record);
		bookDao.update(book);
	}
	
	@Override
	public List<Record> getRecordsByUserId(int user_id){
		return recordDao.getRecordsByUserId(user_id);
	}
	
	@Override
	public void deleteRecord(int id) {
		recordDao.delete(Record.class, id);
	}
}
