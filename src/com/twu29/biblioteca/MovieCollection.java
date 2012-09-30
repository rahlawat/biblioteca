package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollection {
    List<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<Movie>();
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }

    public int count(){
        return movieList.size();
    }

    public String getMovie(int index){
       return (movieList.get(index)).toString();
    }

}