package br.com.wish.booklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wish.booklist.controller.dto.BookDto;
import br.com.wish.booklist.modelo.Book;
import br.com.wish.booklist.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<BookDto> books(String categoryName){
		if (categoryName == null) {
			List<Book> books = bookRepository.findAll();
			return BookDto.convert(books);
		}else {
			List<Book> books = bookRepository.findByCategory(categoryName);
			return BookDto.convert(books);
		}

	}
}
