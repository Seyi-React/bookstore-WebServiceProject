package com.oluwaseyi.bookstore.BookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oluwaseyi.bookstore.BookStore.Entities.Genre;
import com.oluwaseyi.bookstore.BookStore.ServiceLayer.GenreService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/genres")
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping
    public List<Genre> getAllAuthors() {
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getAuthorById(@PathVariable Long id) {
        Genre genre = genreService.getGenreById(id);
        if (genre != null) {
            return ResponseEntity.ok(genre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(@PathVariable Long id, @RequestBody Genre genreDetails) {
        Genre genre = genreService.getGenreById(id);
        if (genre != null) {
            genre.setName(genreDetails.getName());

            return ResponseEntity.ok(genreService.saveGenre(genre));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        genreService.deleteGenre(id);
        return ResponseEntity.noContent().build();
    }
}
