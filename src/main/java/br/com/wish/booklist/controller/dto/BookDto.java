package br.com.wish.booklist.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.wish.booklist.modelo.Book;


public class BookDto {

	private Long id;
	private String title;
	
	public BookDto(Book book) {
		this.id = book.getId();
		this.title = book.getTitle();
	}

	public static List<BookDto> convert(List<Book> books)  {
		return books.stream().map(BookDto::new).collect(Collectors.toList());
	}
	
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	

	
	
}
