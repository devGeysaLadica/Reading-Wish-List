package br.com.wish.booklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wish.booklist.controller.dto.BookDto;
import br.com.wish.booklist.controller.form.BookForm;
import br.com.wish.booklist.modelo.Book;
import br.com.wish.booklist.repository.BookRepository;
import br.com.wish.booklist.repository.CategoryRepository;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
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
	
	/*
	 * BookForm is a DTO that contains the new book information inserted by client.
	 */
	@PostMapping
	public void registerBook(@RequestBody BookForm bookForm) {
		Book newbook = bookForm.convert(categoryRepository);
		bookRepository.save(newbook);
	}
	
}
