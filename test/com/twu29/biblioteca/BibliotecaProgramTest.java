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
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(1, bibliotecaProgram.StartLibrary(fakeBufferedReader));
    }

    @Test
    public void testUserOptions() throws Exception {
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
       Assert.assertEquals(2, bibliotecaProgram.PerformAction(2,fakeBufferedReader));
        Assert.assertEquals(3, bibliotecaProgram.PerformAction(3,fakeBufferedReader));
        Assert.assertEquals(4, bibliotecaProgram.PerformAction(4,fakeBufferedReader));
        Assert.assertEquals(5, bibliotecaProgram.PerformAction(5,fakeBufferedReader));
    }

    @Test
    public void testLogin() throws Exception {
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        Assert.assertEquals(true,bibliotecaProgram.login(fakeBufferedReader));
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
}
