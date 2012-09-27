package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/27/12
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookCollectionTest {
    @Test
    public void testaddBook() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        BookCollection bookCollection = new BookCollection();
        Assert.assertEquals(true,bookCollection.addBook(book));
    }

    @Test
    public void testsearchBook() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        Assert.assertEquals(true,bookCollection.searchBook("Object-Oriented Analysis and Design"));

    }

    @Test
    public void testprintBook() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        ConsoleStub consoleStub = new ConsoleStub("1");
        bookCollection.printBook(consoleStub);
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }
}
