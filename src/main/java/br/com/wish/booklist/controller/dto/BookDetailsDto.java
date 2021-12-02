package br.com.wish.booklist.controller.dto;

import br.com.wish.booklist.modelo.Book;
import br.com.wish.booklist.modelo.ReadStatus;

public class BookDetailsDto {

	private Long id;
	private String title;
	private String author;
	private ReadStatus status;
	//private CategoryBookDto category;
	
	public BookDetailsDto(Book book) {
		this.id = book.getId();
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.status = book.getStatus();
		//TODO[IMPLEMENT] this.category = book.getCategory()
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public ReadStatus getStatus() {
		return status;
	}
}
