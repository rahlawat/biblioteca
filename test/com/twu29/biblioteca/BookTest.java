package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BookTest {

    @Test
    public void testmatches() throws Exception {
         Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals(true,book.matches(new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9")));
    }

    @Test
    public void testprintBook() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
         book.printBook();
        String separator = System.getProperty("line.separator");
        String ExpectedMatch = "Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"+separator;
        Assert.assertEquals(ExpectedMatch, os.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testgetTitle() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Assert.assertEquals("Object-Oriented Analysis and Design",book.getTitle());
    }

    @Test
    public void testgetAuthor() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Assert.assertEquals("Brett D. McLaughlin",book.getAuthor());
    }

    @Test
    public void testgetISBN() throws Exception {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Assert.assertEquals("978-81-8404-221-4",book.getISBN());
    }
}
