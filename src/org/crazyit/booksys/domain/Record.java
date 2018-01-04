package org.crazyit.booksys.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "record_inf")
public class Record {
	private Integer id;
	private Integer user_id;
	private Integer book_id;
	private String category;
	
	private String user_name;
	private String book_name;
	
	@Id
	@Column(name = "id",unique = true,updatable =true,nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "user_id")
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Column(name = "book_id")
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	@Column(name = "category",length=10)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Transient
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Transient
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	
	
}
