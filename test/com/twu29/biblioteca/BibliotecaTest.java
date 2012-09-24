package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BibliotecaTest {
    @Test
    public void testaddBookLog() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addBookLog(bookLogStub));
    }

    @Test
    public void testaddUser() throws Exception {
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi","Rahlawat");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addUser(userStub));
    }

    @Test
    public void testsearchBook() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addBookLog(bookLogStub);
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        biblioteca.searchBook(1);
        String separator = System.getProperty("line.separator");
        Assert.assertEquals("Enjoy The Book."+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

    @Test
    public void testaddMovie() throws Exception {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addMovie(movie));
    }

    @Test
    public void testsearchUser() throws Exception {
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi","Rahlawat");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addUser(userStub);
        Assert.assertEquals(true,biblioteca.searchUser(userStub));
    }

    @Test
    public void testprintBookLog() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addBookLog(bookLogStub);
        Assert.assertEquals(true,biblioteca.printBookLog());
    }

    @Test
    public void testprintMovie() throws Exception {
       Movie movie = new Movie("A",1990,"AB","6");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addMovie(movie);
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        biblioteca.printMovie();
        String separator = System.getProperty("line.separator");
        Assert.assertEquals("A    1990    AB    6"+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }
}
