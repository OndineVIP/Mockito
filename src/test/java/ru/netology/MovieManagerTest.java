package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.MovieManager;


class movieManagerTest {
    MovieManager manager = new MovieManager();
    MovieManager manager2 = new MovieManager(3);

    Movie movie1 = new Movie(1, "Бладшот", "боевик");
    Movie movie2 = new Movie(2, "Вперёд", "мультфильм");
    Movie movie3 = new Movie(3, "Отель \"Белград\"", "комедия");
    Movie movie4 = new Movie(4, "Джентельмены", "боевик");
    Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы");
    Movie movie6 = new Movie(6, "Тролли. Мировой тур", "мультфильм");
    Movie movie7 = new Movie(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.addNewMovie(movie1);
        manager.addNewMovie(movie2);
        manager.addNewMovie(movie3);
        manager.addNewMovie(movie4);
        manager.addNewMovie(movie5);
        manager.addNewMovie(movie6);
        manager.addNewMovie(movie7);
    }

    @BeforeEach
    public void setup2() {
        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);
        manager2.addNewMovie(movie4);
        manager2.addNewMovie(movie5);
        manager2.addNewMovie(movie6);
        manager2.addNewMovie(movie7);
    }

    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager.getLimitManager());
    }

    @Test
    public void testLimitManagerIf3() {

        Assertions.assertEquals(3, manager2.getLimitManager());
    }

    @Test
    public void addNewMovie() {

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSevenMovie() {
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLast() {

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastThree() {

        Movie[] expected = {movie7, movie6, movie5};
        Movie[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastIfMoviesLessManager() {

        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastIfMoviesEqualsManager() {

        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


