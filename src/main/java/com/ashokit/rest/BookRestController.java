package com.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.Book;
import com.ashokit.binding.Books;

@RestController
public class BookRestController {
	
	@PostMapping(value = "/books",
			         consumes = {"application/xml","application/json"}
	)
	public ResponseEntity<String>addboks(@RequestBody Books booksList) {
		List<Book> list = booksList.getBooksList();
		list.forEach(System.out::println);
	return new ResponseEntity<>("Books added...!!!",HttpStatus.OK);
	}
   
	@GetMapping(value = "/books",
			                    produces = {"application/xml","application/json"}
			                   )
	public ResponseEntity<Books> getBooks(){
		
		Books books = new Books();
		Book b1 = new Book(101, "CoreJava",2500.00);
		Book b2 = new Book(102,"AdJava",3000.00);
		Book b3 = new Book(103, "Spring",5000.00);
		Book b4 = new Book(104, "SpringBoot",6000.00);
		Book B5 = new Book(105,"Restful And MicroService",7000.00);
		List<Book> booksList = Arrays.asList(b1,b2,b3,b4,B5);
		
		books.setBooksList(booksList);
		
		return new ResponseEntity<>(books,HttpStatus.OK);
		
		
	}

}
