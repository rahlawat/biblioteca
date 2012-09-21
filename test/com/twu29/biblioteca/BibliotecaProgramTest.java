package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        bibliotecaProgram.InitializeReservedBook();
        bibliotecaProgram.InitializeUser();
        Assert.assertEquals(1, bibliotecaProgram.StartLibrary(fakeBufferedReader));
    }

    @Test
    public void testUserOptions() throws Exception {
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeReservedBook();
        bibliotecaProgram.InitializeUser();
       Assert.assertEquals(0, bibliotecaProgram.PerformAction(2,fakeBufferedReader));
        Assert.assertEquals(3, bibliotecaProgram.PerformAction(3,fakeBufferedReader));
        Assert.assertEquals(4, bibliotecaProgram.PerformAction(4,fakeBufferedReader));
    }
}
