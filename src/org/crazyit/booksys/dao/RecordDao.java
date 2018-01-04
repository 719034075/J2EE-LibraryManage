package org.crazyit.booksys.dao;

import java.util.List;

import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.Record;
import org.crazyit.common.dao.BaseDao;

public interface RecordDao extends BaseDao<Record> {
	
	void delete(int id);
	
	Record get(int id);
	
	public void Save(Record record);
	
	List<Record> findAll();
	
	List<Record> getRecordsByBookId(int book_id);
	
	void update(Record record);
	
	List<Record> getRecordsByUserId(int user_id);
}
