package org.example.movies.data;

import org.example.movies.model.Genre;
import org.example.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.*;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = { id };
        return jdbcTemplate.queryForObject("SELECT * FROM movies WHERE id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("SELECT * FROM movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("INSERT INTO movies (name, minutes, genre) VALUES (?, ?, ?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString()); // Insert genero en String
    }

    @Override
    public Collection<Movie> findByName(String name) {
        String sql = "SELECT * FROM movies WHERE name LIKE " + "'%"+ name + "%'";
        return jdbcTemplate.query(sql, movieMapper);
    }

    private static RowMapper<Movie> movieMapper = (rs, i) -> new Movie(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre")) // transforma el string a un objeto de genre
    );
}
