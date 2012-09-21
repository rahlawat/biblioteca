package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testmatches() throws Exception {
         Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals(true,book.matches(new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9")));
    }
}
