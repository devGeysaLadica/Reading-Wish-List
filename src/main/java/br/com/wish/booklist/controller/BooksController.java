package br.com.wish.booklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public List<BookDto> books(String nameCategory){
		List<Book> books = bookRepository.findAll();
		return BookDto.convert(books);
	}
}
