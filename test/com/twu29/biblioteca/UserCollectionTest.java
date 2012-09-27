package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/27/12
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserCollectionTest {

    @Test
    public void testaddUser() {
        User userStub = new User("Renu Ahlawat","Rahlawat");
        UserCollection userCollection = new UserCollection();
        Assert.assertEquals(true, userCollection.addUser(userStub));
    }

    @Test
    public void testsearchUser() {
        User userStub = new User("Renu Ahlawat","Rahlawat");
        UserCollection userCollection = new UserCollection();
        userCollection.addUser(userStub);
        Assert.assertEquals(true,userCollection.searchUser(userStub));
    }

    @Test
    public void testLogin() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        User user = new User("111-1113","Cpass");
        UserCollection userCollection = new UserCollection();
        userCollection.addUser(user);
        User userNew = new User();
         userCollection.login(consoleStub,userNew);
        Assert.assertTrue(consoleStub.isPrinted("You are successfully logged in."));
    }
}
