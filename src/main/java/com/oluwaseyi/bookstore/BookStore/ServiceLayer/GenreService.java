
package com.oluwaseyi.bookstore.BookStore.ServiceLayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oluwaseyi.bookstore.BookStore.Entities.Genre;
import com.oluwaseyi.bookstore.BookStore.Repositories.GenreRepository;

import java.util.List;



@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}

