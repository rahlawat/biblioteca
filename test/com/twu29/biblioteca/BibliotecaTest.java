package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BibliotecaTest {
    @Test
    public void testaddBookLog() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addBookLog(bookLogStub));
    }

    @Test
    public void testaddReservedBook() throws Exception {
        ReservedBookStub reservedBookStub = new ReservedBookStub();
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addReservedBook(reservedBookStub));
    }

    @Test
    public void testaddUser() throws Exception {
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertEquals(true,biblioteca.addUser(userStub));
    }

    @Test
    public void testsearchBook() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addBookLog(bookLogStub);
        Assert.assertEquals(bookLogStub,biblioteca.searchBook(bookLogStub));
    }

    @Test
    public void testsearchReservedBooks() throws Exception {
        ReservedBookStub reservedBookStub = new ReservedBookStub();
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addReservedBook(reservedBookStub);
        Assert.assertEquals(reservedBookStub,biblioteca.searchReservedBooks(reservedBookStub));
    }

    @Test
    public void testsearchUser() throws Exception {
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addUser(userStub);
        Assert.assertEquals(userStub,biblioteca.searchUser(userStub));
    }

    @Test
    public void testprintBookLog() throws Exception {
        BookLogStub bookLogStub = new BookLogStub();
        Biblioteca biblioteca = new Biblioteca();
       //biblioteca.addBookLog(bookLogStub);
        Assert.assertEquals(true,biblioteca.printBookLog());
    }
}
