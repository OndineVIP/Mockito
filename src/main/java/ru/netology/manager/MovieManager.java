package ru.netology.manager;



public class MovieManager {
    private int limitManager = 5;

    public MovieManager() {
    }

    public MovieManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public MovieManager(int i, String бладшот, String боевик) {
    }

    public int getLimitManager() {
        return limitManager;
    }


    public MovieManager[] movies = new MovieManager[0];

    public void addNewMovie(MovieManager movie) {
        MovieManager[] tmp = new MovieManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieManager[] findAll() {
        return movies;
    }


    public MovieManager[] findLast() {
        int resultLenght;
        if (limitManager == movies.length) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitManager;
        }
        MovieManager[] result = new MovieManager[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}