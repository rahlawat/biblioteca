package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollection {
    List<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<Movie>();
    }

    public boolean addMovie(Movie movie) {
        this.movieList.add(movie);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void printMovie(Console console) {
        for (Iterator i = movieList.iterator(); i.hasNext(); ) {
            Movie movie = (Movie) i.next();
            console.println(movie.toString());
        }
    }
}