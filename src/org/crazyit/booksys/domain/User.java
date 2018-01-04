package org.crazyit.booksys.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_inf")
public class User {
	private Integer id;
	private String name;
	private String password;
	private String category;
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
	@Column(name = "password",length=60)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "category",length=1)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

	
	
}
