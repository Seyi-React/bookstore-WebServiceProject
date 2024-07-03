package com.oluwaseyi.bookstore.BookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oluwaseyi.bookstore.BookStore.Entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {}
