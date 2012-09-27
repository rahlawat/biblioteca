package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/24/12
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private String movieName;
    private int movieYear;
    private String movieDirector;
    private String movieRating;

    public Movie(String movieName, int movieYear, String movieDirector, String movieRating) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }


    @Override
    public String toString() {
        return movieName+"    "+movieYear+"    "+movieDirector+"    "+movieRating;
    }
}
