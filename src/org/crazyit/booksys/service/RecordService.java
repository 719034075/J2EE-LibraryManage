package org.crazyit.booksys.service;

import java.util.List;

import org.crazyit.booksys.domain.Record;

public interface RecordService {
	int addRecord(Record record);

	void returnBook(int id);
	
	List<Record> getAllRecords();

	List<Record> getRecordsByUserId(int user_id);
	
	void deleteRecord(int id);
}
