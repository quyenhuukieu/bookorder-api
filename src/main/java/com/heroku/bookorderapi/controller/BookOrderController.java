package com.heroku.bookorderapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class BookOrderController {
	
	private final Logger LOG = LoggerFactory.getLogger(BookOrderController.class);
	
	@GetMapping("/api/greeting")
	public String hello() {
		LOG.info("Inside Book Order hello");
		return "Hello there now from Book Order api";
	}
}
