package org.example.movies.data;

import org.example.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(long id); // Obtener una pelicula por id
    Collection<Movie> findAll(); // Obtiene una lista de todas las peliculas
    void saveOrUpdate(Movie movie); // Guarda o actualiza una pelicula
}
