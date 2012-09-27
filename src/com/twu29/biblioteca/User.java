package com.twu29.biblioteca;

public class User {
    private String userName;
    private String password;
    private boolean isLoggedIn;

    public User(String userName,String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(){}

    @Override
    public String toString() {
        return userName;
    }

    public boolean matches(User user) {
        boolean valid = false;
        if(userName.equals(user.userName) && password.equals(user.password))
            valid =  true;
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
        if(isLoggedIn ==true)
        return true;
        else
            return false;
    }

    public void getUserDetails(Console console) {
        UserMenu userMenu = new UserMenu();
        String name =  userMenu.getUserInput(console,"Enter your name: ");
        String password = userMenu.getUserInput(console,"Enter your password: ");
        this.userName = name;
        this.password = password;

    }

}
