package com.oluwaseyi.bookstore.BookStore.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwaseyi.bookstore.BookStore.Entities.Book;






    public interface BookRepository extends JpaRepository<Book, Long> {}
    