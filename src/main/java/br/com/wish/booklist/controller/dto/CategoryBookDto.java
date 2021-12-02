package br.com.wish.booklist.controller.dto;

import br.com.wish.booklist.modelo.CategoryBook;

public class CategoryBookDto {

	private String title;
	
	public CategoryBookDto (CategoryBook category) {
		this.title = category.getTitle();
	}

	public String getTitle() {
		return title;
	}
	
}
