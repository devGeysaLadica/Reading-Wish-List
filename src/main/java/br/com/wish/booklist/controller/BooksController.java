package br.com.wish.booklist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	public List<BookDto> books(String nameCategory){
		
	}
}
