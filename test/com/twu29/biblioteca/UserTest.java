package com.twu29.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testmatches() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        Assert.assertEquals(true,user.matches(new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011")));
    }
}
