package com.twu29.biblioteca;

import junit.framework.Assert;

import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class UserMenuTest {

    @Test
    public void testDisplayWelcomeNote() throws Exception {
        UserMenu capture;
        capture = new UserMenu();
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        capture.DisplayWelcomeNote();
        String separator = System.getProperty("line.separator");
        Assert.assertEquals("Welcome To Biblioteca"+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

    @Test
    public void testDisplayMenu() throws Exception {
        UserMenu capture;
        capture = new UserMenu();
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        capture.DisplayMenu();
        String separator = System.getProperty("line.separator");
        String ExpectedMatch = "1. Login"+separator+"2. List Of Books"+separator+"3. Select Book"+separator+"4. Movie Catalog"+separator+"5. Contact"+separator;
        Assert.assertEquals(ExpectedMatch, os.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testgetUserInput() throws Exception {
        UserMenu userMenu;
        userMenu = new UserMenu();
        ConsoleStub consolestub = new ConsoleStub("1");
        Assert.assertEquals("111-1113",userMenu.getUserInput(consolestub,"Enter your name: "));

    }


}
