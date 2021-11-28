package br.com.wish.booklist.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	
	@Enumerated(EnumType.STRING)
	private ReadStatus status = ReadStatus.WISH_LIST;
	
	@ManyToOne
	private CategoryBook category;
	
	public Book() {

	}

	public Book(Long id, String title, String author, ReadStatus status, CategoryBook category) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.status = status;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public ReadStatus getStatus() {
		return status;
	}

	public void setStatus(ReadStatus status) {
		this.status = status;
	}

	public CategoryBook getCategory() {
		return category;
	}

	public void setCategory(CategoryBook category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id)
				&& Objects.equals(title, other.title);
	}
	
	
	
	
}
