package org.crazyit.booksys.action;

import java.util.List;

import org.crazyit.booksys.domain.Record;
import org.crazyit.booksys.domain.User;
import org.crazyit.booksys.service.RecordService;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Repository
public class ReturnBookAction extends ActionSupport {
	private RecordService recordService;

	public RecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	private Record record;
	private List<Record> records;
	private int id;

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() {
		recordService.returnBook(id);
		return SUCCESS;
	}

}
