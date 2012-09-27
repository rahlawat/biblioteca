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
        Assert.assertEquals(true,movieCollection.addMovie(movie));
    }

    @Test
    public void testprintMovie() {
        Movie movie = new Movie("A",1990,"AB","6");
        ConsoleStub consoleStub = new ConsoleStub("1");
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.addMovie(movie);
        movieCollection.printMovie(consoleStub);
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(consoleStub.isPrinted("A    1990    AB    6"));
    }
}
