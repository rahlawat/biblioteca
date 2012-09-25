package com.twu29.biblioteca;

public class User {
    private String userName;
    private String password;
    private boolean isLoggedIn;

    public User(String userName,String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public boolean matches(User user) {
        boolean valid = true;
        if(userName != user.getUserName())
            valid =  false;
        if(password != user.getPassword())
            valid =  false;
        if(valid == true){
            isLoggedIn = true;
        }
        else
        {
            isLoggedIn = false;
        }
        return valid;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    protected String getPassword() {
        return password;
    }
}
