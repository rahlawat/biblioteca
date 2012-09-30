package com.twu29.biblioteca;

public class User implements IUser {
    private String userName;
    private String password;
    private boolean loggedIn;

    public User(String userName,String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return userName;
    }

    public boolean matches(User user) {
        loggedIn = (userName.equals(user.userName) && password.equals(user.password));
        return loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
