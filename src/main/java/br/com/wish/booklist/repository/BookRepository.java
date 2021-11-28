package br.com.wish.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wish.booklist.modelo.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
