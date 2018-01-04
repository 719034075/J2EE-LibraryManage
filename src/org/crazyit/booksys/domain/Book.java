package org.crazyit.booksys.domain;

import javax.persistence.*;

@Entity
@Table(name = "book_inf")
public class Book {

	private Integer id;
	private String name;
	private double price;
	private String author;
	private Integer collection;
	private Integer allowance;

	
	@Id
	@Column(name = "id",unique = true,updatable =true,nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name",length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(name = "collection")
	public Integer getCollection() {
		return collection;
	}

	public void setCollection(Integer collection) {
		this.collection = collection;
	}
	@Column(name = "allowance")
	public Integer getAllowance() {
		return allowance;
	}

	public void setAllowance(Integer allowance) {
		this.allowance = allowance;
	}
	
	
}
