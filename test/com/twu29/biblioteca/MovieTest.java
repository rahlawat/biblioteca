package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/24/12
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void testtoString() {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        String ExpectedMatch = "Roza    1992    Mani Ratnam    9";
        Assert.assertEquals(ExpectedMatch, movie.toString());
    }

}
