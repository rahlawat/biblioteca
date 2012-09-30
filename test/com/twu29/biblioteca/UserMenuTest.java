package com.twu29.biblioteca;

import junit.framework.Assert;

import org.junit.Test;

public class UserMenuTest {

    @Test
    public void testDisplayWelcomeNote() {
        UserMenu capture;
        ConsoleStub consoleStub = new ConsoleStub("1");
        capture = new UserMenu(consoleStub);
        capture.DisplayWelcomeNote();
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(consoleStub.isPrinted("Welcome To Biblioteca"));

    }

    @Test
    public void testDisplayMenu() {
        UserMenu capture;
        ConsoleStub consoleStub = new ConsoleStub("1");
        capture = new UserMenu(consoleStub);
        capture.Display();
        String separator = System.getProperty("line.separator");
        String ExpectedMatch = "1. Login"+separator+"2. List Of Books"+separator+"3. Select Book"+separator+"4. Movie Catalog"+separator+"5. Contact"+separator+"6. Quit";
        Assert.assertTrue(consoleStub.isPrinted(ExpectedMatch));
    }

}
