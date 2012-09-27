package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserCollection {
    List<User> userList;

    public UserCollection() {
        userList = new ArrayList<User>();
    }

    public boolean addUser(User user) {
        this.userList.add(user);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean searchUser(User user) {
        for (Iterator i = userList.iterator(); i.hasNext(); ) {
            User user1 = (User) i.next();
            if (user.matches(user1))
                return true;
        }
        return false;
    }

    public void login(Console console,User user) {
        boolean loggedin = false;
        if(user.isLoggedIn()){
            console.println("You are already Logged in");
        }
        else
        {
             user.getUserDetails(console);

            loggedin = searchUser(user);
            if(loggedin == true)
                console.println("You are successfully logged in.");
            else
                console.println("Username/Password is Wrong.");
        }
    }
}