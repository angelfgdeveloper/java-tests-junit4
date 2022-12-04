package org.example.movies.data;

import org.example.movies.model.Genre;
import org.example.movies.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieRepositoryIntegrationTest {

    // DB de pruebas en memoria
    private static DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
    private static JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    private MovieRepositoryJdbc movieRepositoryJdbc;

    @Before
    public void setUp() throws ScriptException, SQLException {
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        movieRepositoryJdbc = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void load_all_movies() /*throws SQLException*/ {
        // Ejemplo de conexion a DB
        //DataSource dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        //ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        //JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        //MovieRepositoryJdbc movieRepositoryJdbc = new MovieRepositoryJdbc(jdbcTemplate);

        Collection<Movie> movies = movieRepositoryJdbc.findAll();
        assertThat(movies, is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));
    }

    @Test
    public void load_movie_by_id() {
        Movie movie = movieRepositoryJdbc.findById(2);
        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    public void insert_a_movie() {
        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);
        movieRepositoryJdbc.saveOrUpdate(movie); // insert movie

        Movie movieFromDB = movieRepositoryJdbc.findById(4);
        assertThat(movieFromDB, is(new Movie(4, "Super 8", 112, Genre.THRILLER)));
    }

    @Test
    public void get_movies_by_name() {
        Collection<Movie> movies = movieRepositoryJdbc.findByName("M");

        assertThat(movies, is(Arrays.asList(
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION))
        ));
    }

    @After
    public void tearDown() throws Exception {
        // Limpia DB
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files"); // "shutdown" solo si es DB en memoria
    }
}