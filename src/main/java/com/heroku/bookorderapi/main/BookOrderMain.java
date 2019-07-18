package com.heroku.bookorderapi.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import com.heroku.bookorderapi.dao.IBookRepository;
import com.heroku.bookorderapi.main.BookOrderMain;
import com.heroku.bookorderapi.model.Book;

@SpringBootApplication
public class BookOrderMain {

	private final Logger LOG = LoggerFactory.getLogger(BookOrderMain.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookOrderMain.class, args);
	}
	
//	@Bean
//	ApplicationRunner applicationRunner(IBookRepository bookRepository) {
//		LOG.info("Inside application runner");
//		return args -> {
//			bookRepository.save(new Book("Rome Sweet Home", "Scott Hahn"));
//			bookRepository.save(new Book("Men, Women and the Mystery of Love: Practical Insights from John Paul II's Love and Responsibility", "Edward Sri"));
//			bookRepository.save(new Book("Resisting Happiness", "Matthew Kelly"));
//			bookRepository.save(new Book("Good News about Sex and Marriages", "Christopher West"));
//		};
//	}

}
