package com.twu29.biblioteca;

import junit.framework.Assert;

import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class UserMenuTest {

    @Test
    public void testDisplayWelcomeNote() {
        UserMenu capture;
        capture = new UserMenu();
        ConsoleStub consoleStub = new ConsoleStub("1");
        capture.DisplayWelcomeNote(consoleStub);
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(consoleStub.isPrinted("Welcome To Biblioteca"));

    }

    @Test
    public void testDisplayMenu() {
        UserMenu capture;
        capture = new UserMenu();
        ConsoleStub consoleStub = new ConsoleStub("1");
        capture.DisplayMenu(consoleStub);
        String separator = System.getProperty("line.separator");
        String ExpectedMatch = "1. Login"+separator+"2. List Of Books"+separator+"3. Select Book"+separator+"4. Movie Catalog"+separator+"5. Contact";
        Assert.assertTrue(consoleStub.isPrinted(ExpectedMatch));
    }

    @Test
    public void testgetUserInput() {
        UserMenu userMenu;
        userMenu = new UserMenu();
        ConsoleStub consolestub = new ConsoleStub("1");
        Assert.assertEquals("111-1113",userMenu.getUserInput(consolestub,"Enter your name: "));

    }


}
