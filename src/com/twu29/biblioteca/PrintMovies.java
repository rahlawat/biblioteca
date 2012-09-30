package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrintMovies implements Action {
    private Console console;
    private MovieCollection movieCollection;

    public PrintMovies(Console console, MovieCollection movieCollection) {
        this.console = console;
        this.movieCollection = movieCollection;
    }

    public void userAction() {
        for(int i = 0;i<movieCollection.count();i++)
        {
            console.println(movieCollection.getMovie(i));
        }
    }
}
