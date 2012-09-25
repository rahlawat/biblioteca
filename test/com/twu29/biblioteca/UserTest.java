package com.twu29.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testmatches() throws Exception {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertEquals(true,user.matches(new User("Renu Ahlawat","rahlawat")));
    }

    @Test
    public void testgetName() throws Exception {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertEquals("Renu Ahlawat",user.getUserName());
    }

    @Test
    public void testisLoggedIn() throws Exception {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertEquals(false,user.isLoggedIn());
    }

    @Test
    public void testgetPassword() throws Exception {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertEquals("rahlawat",user.getPassword());
    }
}
