package com.oluwaseyi.bookstore.BookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwaseyi.bookstore.BookStore.Entities.Author;



public interface AuthorRepository extends JpaRepository<Author, Long> {}