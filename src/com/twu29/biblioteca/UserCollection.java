package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserCollection {
    List<User> userList;

    public UserCollection() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public boolean searchUser(IUser user) {
        for (Iterator i = userList.iterator(); i.hasNext(); ) {
            User user1 = (User) i.next();
            if (((User)user).matches(user1)){
                return true;
            }
        }
        return false;
    }

    public boolean Authenticate(IUser user) {
           return searchUser(user);
    }
}