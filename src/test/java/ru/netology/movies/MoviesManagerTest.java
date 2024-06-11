package ru.netology.movies;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MoviesManager;

public class MoviesManagerTest {

    @Test

    public void giveAnEmptyList () {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void addOneMovie () {
        MoviesManager manager = new MoviesManager();

        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String [] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addMultipleMovie () {
        MoviesManager manager = new MoviesManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");


        String[] expected = {"Бладшот", "Вперёд", "Джентельмены", "Человек-невидимка"};
        String [] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void bringOutMoviesBelowTheLimit() {
        MoviesManager manager = new MoviesManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");

        String[] expected = {"Человек-невидимка","Джентельмены", "Вперёд", "Бладшот" };
        String [] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void bringOutMoviesOverTheLimit() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Номер один");
        manager.add("Тролли.Мировой тур");

        String[] expected = {"Тролли.Мировой тур", "Номер один", "Человек-невидимка","Джентельмены", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
