package org.crazyit.booksys.action;

import java.util.List;

import org.crazyit.booksys.domain.Book;
import org.crazyit.booksys.domain.User;
import org.crazyit.booksys.service.BookService;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Repository
public class BorrowBookAction  extends ActionSupport {
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	private Book book;
	private List<Book> books;
	private int book_id;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

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



	public String execute() {
		User user=(User)ActionContext.getContext().getSession().get("user");
		boolean isBorrow= bookService.borrowBook(book_id,user.getId());
		if(isBorrow){
			return "success";
		}else{
			return "failure";
		}
	}

}