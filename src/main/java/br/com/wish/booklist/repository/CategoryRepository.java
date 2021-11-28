package br.com.wish.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wish.booklist.modelo.CategoryBook;

public interface CategoryRepository extends JpaRepository <CategoryBook, Long> {

	CategoryBook findByTitle(String categoryName);

}
