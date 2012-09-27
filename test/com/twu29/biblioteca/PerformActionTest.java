package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 1:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformActionTest {

    @Test
    public void testPerformBookSelection() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformBookSelection performBookSelection = new PerformBookSelection();
        performBookSelection.performAction(consoleStub, bibliotecaProgram);
        Assert.assertTrue(consoleStub.isPrinted("Thank You! Enjoy the book."));
    }

    @Test
    public void testPerformLogin() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformLogin performLogin = new PerformLogin();
        performLogin.performAction(consoleStub, bibliotecaProgram);
        Assert.assertTrue(consoleStub.isPrinted("You are successfully logged in."));
    }

    @Test
    public void testPerformGetDetails() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformGetDetails performGetDetails = new PerformGetDetails();
        performGetDetails.performAction(consoleStub, bibliotecaProgram);
        Assert.assertTrue(consoleStub.isPrinted("Please talk to Librarian. Thank you."));
    }

    @Test
    public void testPerformPrintBook() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformPrintBook performPrintBook = new PerformPrintBook();
        performPrintBook.performAction(consoleStub, bibliotecaProgram);
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }

    @Test
    public void testPerformPrintMovie() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformPrintMovie performPrintMovie = new PerformPrintMovie();
        performPrintMovie.performAction(consoleStub, bibliotecaProgram);
       Assert.assertTrue(consoleStub.isPrinted("Dil Se    1998    Mani Ratnam    9"));
    }

    @Test
    public void testPerformShowWarning() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        PerformShowWarning performShowWarning = new PerformShowWarning();
        performShowWarning.performAction(consoleStub, bibliotecaProgram);
        Assert.assertTrue(consoleStub.isPrinted("Select a valid option!!"));
    }
}
