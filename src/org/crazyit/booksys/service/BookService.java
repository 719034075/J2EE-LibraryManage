package org.crazyit.booksys.service;

import java.util.List;

import org.crazyit.booksys.domain.Book;

public interface BookService {
	
	int addBook(Book book);

	List<Book> getAllBooks();

	boolean borrowBook(int book_id,int user_id);
	
	void deleteBook(int id);
}
