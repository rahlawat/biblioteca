package com.twu29.biblioteca;

public class User {
    private String userName;
    private String address;
    private String password;
    private boolean isLoggedIn;

    public User(String userName, String address,String password) {
        this.userName = userName;
        this.address = address;
        this.password = password;
    }
    public User(){}

    public void setName(String name) {
        this.userName = name;
    }

    public String getName() {
        return userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public boolean matches(User user) {
        if(userName != user.getName())
            return false;
        if((address != null) && (user.getAddress() != address))
            return false;
        if(password != user.password)
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
