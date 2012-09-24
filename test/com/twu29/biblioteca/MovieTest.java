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
    public void testprintMovie() throws Exception {
        Movie movie = new Movie("Players",2012,"Abbas-Mustan","5");
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        movie.printMovie();
        String separator = System.getProperty("line.separator");
        String ExpectedMatch = "Players    2012    Abbas-Mustan    5"+separator;
        Assert.assertEquals(ExpectedMatch, os.toString());
        System.setOut(originalOut);

    }
}
