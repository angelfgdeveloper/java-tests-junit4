package org.example.movies.service;

import org.example.movies.data.MovieRepository;
import org.example.movies.model.Genre;
import org.example.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

// Clase de negocio
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        Collection<Movie> moviesWithGenre = movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());

        return moviesWithGenre;
    }

    public Collection<Movie> findMoviesByLength(int length) {
        // Minutos sea menor o igual a la duracion
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByName(String name) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }
}
