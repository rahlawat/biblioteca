package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaProgramTest {

    @Test
    public void testSelectBook() {
        ConsoleStub consoleStub = new ConsoleStub("3");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Thank You! Enjoy the book."));
    }

    @Test
    public void testlogin() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("You are successfully logged in."));
    }

    @Test
    public void testGetDetails() {
        ConsoleStub consoleStub = new ConsoleStub("5");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Please talk to Librarian. Thank you."));
    }

    @Test
    public void testListOfBooks() {
        ConsoleStub consoleStub = new ConsoleStub("2");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }

    @Test
    public void testMovieCatalog() {
        ConsoleStub consoleStub = new ConsoleStub("4");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
    }

    @Test
    public void testShowWarning() {
        ConsoleStub consoleStub = new ConsoleStub("6");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        bibliotecaProgram.StartLibrary(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Select a valid option!!"));
    }

    @Test
    public void testgetDetails() {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        ConsoleStub consoleStub = new ConsoleStub("1");
        bibliotecaProgram.getDetails(consoleStub);
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(consoleStub.isPrinted("Please talk to Librarian. Thank you."));
    }



    @Test
    public void testsearchBook() {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        String bookName = "The Programming Language of Oracle";
        Assert.assertEquals(true,bibliotecaProgram.searchBook(bookName));
    }

    @Test
    public void testgetUserInput()  {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        ConsoleStub consoleStub = new ConsoleStub("1");
        Assert.assertEquals("111-1113",bibliotecaProgram.getUserInput(consoleStub,"Enter your name: "));
    }

    @Test
    public void testprintBook() {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        ConsoleStub consoleStub = new ConsoleStub("1");
        bibliotecaProgram.printBook(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }

    @Test
    public void testprintMovie() {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        ConsoleStub consoleStub = new ConsoleStub("1");
        bibliotecaProgram.printMovie(consoleStub);
        Assert.assertTrue(consoleStub.isPrinted("Dil Se    1998    Mani Ratnam    9"));
    }

}
