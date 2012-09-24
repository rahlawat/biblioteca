package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaProgramTest {
    @Test
    public void testInitializeBookLog() throws Exception {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(1, bibliotecaProgram.StartLibrary(new ConsoleStub("1")));
        Assert.assertEquals(2, bibliotecaProgram.StartLibrary(new ConsoleStub("2")));
        Assert.assertEquals(3, bibliotecaProgram.StartLibrary(new ConsoleStub("3")));
        Assert.assertEquals(4, bibliotecaProgram.StartLibrary(new ConsoleStub("4")));
        Assert.assertEquals(5, bibliotecaProgram.StartLibrary(new ConsoleStub("5")));
        Assert.assertEquals(-1, bibliotecaProgram.StartLibrary(new ConsoleStub("6")));
    }

    @Test
    public void testLogin() throws Exception {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(true,bibliotecaProgram.login(consoleStub));
    }

    @Test
    public void testgetDetails() throws Exception {
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        bibliotecaProgram.getDetails();
        String separator = System.getProperty("line.separator");
        Assert.assertEquals("Please talk to Librarian. Thank you."+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

    @Test
    public void testgetUserDetails() throws Exception {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(true,bibliotecaProgram.getUserDetails(new ConsoleStub("1")));
    }

    @Test
    public void testsearchBook() throws Exception {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        String bookName = "The Programming Language of Oracle";
        Assert.assertEquals(true,bibliotecaProgram.searchBook(bookName));
    }

    @Test
    public void testgetUserInput() throws Exception {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        ConsoleStub consoleStub = new ConsoleStub("1");
        Assert.assertEquals("111-1113",bibliotecaProgram.getUserInput(consoleStub,"Enter your name: "));
    }

    @Test
    public void testprintBook() throws Exception {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(true,bibliotecaProgram.printBook());
    }

    @Test
    public void testprintMovie() throws Exception {
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(true,bibliotecaProgram.printMovie());
    }
}
