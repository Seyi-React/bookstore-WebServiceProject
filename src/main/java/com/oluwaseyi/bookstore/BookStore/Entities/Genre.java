package com.oluwaseyi.bookstore.BookStore.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Set;

import jakarta.persistence.*;
// import jakarta.persistence.OneToMany;



    @Entity
    public class Genre {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Set<Book> books;

        // Getters and setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<Book> getBooks() {
            return books;
        }

        public void setBooks(Set<Book> books) {
            this.books = books;
        }

    }

   