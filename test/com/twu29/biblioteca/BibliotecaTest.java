package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BibliotecaTest {
    @Test
    public void testaddBook() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addBook(book));
    }

    @Test
    public void testaddUser() throws Exception {
        User userStub = new User("Renu Ahlawat","Rahlawat");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addUser(userStub));
    }

    @Test
    public void testsearchBook() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addBook(book);
        Assert.assertEquals(true,biblioteca.searchBook("Object-Oriented Analysis and Design"));

    }

    @Test
    public void testaddMovie() throws Exception {
        Movie movie = new Movie("Roza",1992,"Mani Ratnam","9");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addMovie(movie));
    }

    @Test
    public void testsearchUser() throws Exception {
        User userStub = new User("Renu Ahlawat","Rahlawat");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addUser(userStub);
        Assert.assertEquals(true,biblioteca.searchUser(userStub));
    }

    @Test
    public void testprintBook() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addBook(book);
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        biblioteca.printBook();
        String separator = System.getProperty("line.separator");
        Assert.assertEquals("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
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
