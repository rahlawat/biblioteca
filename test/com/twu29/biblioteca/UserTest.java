package com.twu29.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testmatches() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi","rahlawat");
        Assert.assertEquals(true,user.matches(new User("Renu Ahlawat","New Delhi","rahlawat")));
    }
}
