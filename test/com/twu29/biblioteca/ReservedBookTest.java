package com.twu29.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class ReservedBookTest {

    @Test
    public void testmatches() throws Exception {
        BookStub bookStub = new BookStub();
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals(true,reserverBook.matches(new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012")));
    }
}
