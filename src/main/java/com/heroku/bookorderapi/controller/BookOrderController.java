package com.heroku.bookorderapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.heroku.bookorderapi.dao.IBookRepository;
import com.heroku.bookorderapi.model.Book;

@RestController
@CrossOrigin(origins="*")
public class BookOrderController {
	
	private final Logger LOG = LoggerFactory.getLogger(BookOrderController.class);
	
//	private final IBookRepository bookRepository;
//	
//	public BookOrderController(IBookRepository bookRepository) {		
//		super();
//		LOG.info("Inside Book Order Controller");
//		this.bookRepository = bookRepository;
//	}

	@GetMapping("/api/greeting")
	public String hello() {
		LOG.info("Inside Book Order hello");
		return "Hello there now from Book Order api";
	}
		
//	@GetMapping("/api/books")
//	public Iterable<Book> GetBooks() {
//		LOG.info("Inside get all books");
//		return bookRepository.findAll();
//	}
}
