package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookLogTest {
    @Test
    public void testmatches() throws Exception {
        BookStub bookStub = new BookStub();
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(true, bookLog.matches(new BookLog(bookStub,10,8)));
    }

    @Test
    public void testupdateUnreserverCopies() throws Exception {
        BookStub bookStub = new BookStub();
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(9,bookLog.updateUnreservedCopies(1));
    }
}
