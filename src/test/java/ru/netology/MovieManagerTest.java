package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    MovieManager manager2 = new MovieManager(3);

    MovieManager movie1 = new MovieManager(1, "Бладшот", "боевик");
    MovieManager movie2 = new MovieManager(2, "Вперёд", "мультфильм");
    MovieManager movie3 = new MovieManager(3, "Отель \"Белград\"", "комедия");
    MovieManager movie4 = new MovieManager(4, "Джентельмены", "боевик");
    MovieManager movie5 = new MovieManager(5, "Человек-невидимка", "ужасы");
    MovieManager movie6 = new MovieManager(6, "Тролли. Мировой тур", "мультфильм");
    MovieManager movie7 = new MovieManager(7, "Номер один", "комедия");

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

        MovieManager[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MovieManager[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSevenMovie() {
        MovieManager[] expected = {movie1, movie2, movie3,movie4, movie5, movie6, movie7};
        MovieManager[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLast() {

        MovieManager[] expected = {movie7, movie6, movie5, movie4, movie3};
        MovieManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastThree() {

        MovieManager[] expected = {movie7, movie6, movie5};
        MovieManager[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


