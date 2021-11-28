package br.com.wish.booklist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.wish.booklist.modelo.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	@Query("SELECT b FROM Book b WHERE b.category.title= :categoryName")
	List<Book> findByCategory(String categoryName);


}

