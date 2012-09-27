package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BookTest {

    @Test
    public void testmatches() {
         Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals(true,book.matchTitle(new String("When The Light Fades")));
    }

    @Test
    public void testtoString() {
        Book book = new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        String ExpectedMatch = "Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4";
        Assert.assertEquals(ExpectedMatch, book.toString());
    }
}
