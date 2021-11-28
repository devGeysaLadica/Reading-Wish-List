package br.com.wish.booklist.controller.form;

import br.com.wish.booklist.modelo.Book;
import br.com.wish.booklist.modelo.CategoryBook;
//import br.com.wish.booklist.modelo.CategoryBook;
import br.com.wish.booklist.modelo.ReadStatus;
import br.com.wish.booklist.repository.CategoryRepository;

public class BookForm {

	private String title;
	private String author;
	private String categoryName;
//	private CategoryBook category;
	private ReadStatus status;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public ReadStatus getStatus() {
		return status;
	}
	public void setStatus(ReadStatus status) {
		this.status = status;
	}
	
	public Book convert(CategoryRepository categoryRepository) {
		CategoryBook category = categoryRepository.findByTitle(categoryName);
		return new Book(title,author,status,category);
	}
	
	
}
