package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/27/12
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieCollectionTest {

    @Test
    public void testaddMovie() {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        Assert.assertEquals(1,movieCollection.count());
    }

    @Test
    public void testmovieCount() {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        Movie movie1 = new Movie("Heroine",2012,"Madhur Bhandarkar","N/A");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie1);
        Assert.assertEquals(2,movieCollection.count());
    }

    @Test
    public void testtoString() {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        String expectedString = "Roza    1992    Mani Ratnam    9";
        Assert.assertEquals(expectedString,movieCollection.getMovie(0));
    }
}
