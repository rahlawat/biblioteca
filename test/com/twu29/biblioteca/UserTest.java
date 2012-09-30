package com.twu29.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testmatches() {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertEquals(true,user.matches(new User("Renu Ahlawat","rahlawat")));
    }

    @Test
    public void testisLoggedIn() {
        User user = new User("Renu Ahlawat","rahlawat");
        Assert.assertFalse(user.isLoggedIn());
    }

    @Test
    public void testtoString() {
        User user =new User("111-1113","Cpass");
        String ExpectedMatch = "111-1113";
        Assert.assertEquals(ExpectedMatch, user.toString());
    }
}
