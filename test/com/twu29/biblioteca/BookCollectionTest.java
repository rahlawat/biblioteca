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
        bookCollection.addBook(book);
        Assert.assertTrue(bookCollection.searchBook("Object-Oriented Analysis and Design"));
    }

    @Test
    public void testsearchBook() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        Assert.assertEquals(true,bookCollection.searchBook("Object-Oriented Analysis and Design"));

    }

    @Test
    public void testbookCount() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        bookCollection.addBook(book2);
        Assert.assertEquals(2,bookCollection.count());
    }

    @Test
    public void testtoString() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        String expectedString = "Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4";
        Assert.assertEquals(expectedString,bookCollection.bookInformation(0));
    }
}
