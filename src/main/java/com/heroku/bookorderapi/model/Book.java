package com.heroku.bookorderapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}	
	
}
