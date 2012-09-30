package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaLibraryTest {

    @Test
    public void testSelectBook() {
        ConsoleStub consoleStub = new ConsoleStub("3");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("Please Login First."));
    }

    @Test
    public void testlogin() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("You are successfully logged in."));
    }

    @Test
    public void testGetDetails() {
        ConsoleStub consoleStub = new ConsoleStub("5");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("Please talk to Librarian. Thank you."));
    }

    @Test
    public void testListOfBooks() {
        ConsoleStub consoleStub = new ConsoleStub("2");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }

    @Test
    public void testMovieCatalog() {
        ConsoleStub consoleStub = new ConsoleStub("4");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("Dil Se    1998    Mani Ratnam    9"));

    }

    @Test
    public void testShowWarning() {
        ConsoleStub consoleStub = new ConsoleStub("6");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        String UserInput =consoleStub.readLine("Enter your choice: ");
        bibliotecaLibrary.StartLibrary(UserInput);
        Assert.assertTrue(consoleStub.isPrinted("Select a valid option!!"));
    }

}
