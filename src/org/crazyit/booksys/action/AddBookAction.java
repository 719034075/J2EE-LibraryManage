package org.crazyit.booksys.action;

import java.util.List;

import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.service.BookService;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionSupport;

@Repository
public class AddBookAction extends ActionSupport {
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	private Book book;
	private List<Book> books;
	private int id;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String execute() {
		book.setAllowance(book.getCollection());
		int result = bookService.addBook(book);
		if (result > 0) {
			return "success";
		}
		return "failure";
	}

}
