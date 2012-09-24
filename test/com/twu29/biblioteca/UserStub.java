package com.twu29.biblioteca;


public class UserStub extends User {
    public UserStub(String userName, String address,String password) {
        super(userName, address, password);
    }
    public boolean matches(UserStub user) {
        return true;
    }
}
