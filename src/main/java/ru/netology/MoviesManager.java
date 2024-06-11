package ru.netology;

public class MoviesManager {
    private String[] movies = new String[0];
    int limit;

    public MoviesManager() {
        this.limit = 5;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }


    public void add(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {
        int result;
        if (movies.length < limit) {
            result = movies.length;
        } else {
            result = limit;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }

}
