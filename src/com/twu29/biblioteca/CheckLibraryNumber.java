package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class CheckLibraryNumber implements Action {

    private Console console;
    private IUser user;

    public CheckLibraryNumber(Console console, IUser user) {
        this.console = console;
        this.user = user;
    }

    public void userAction() {
        if((user.toString() != null ) && (user.isLoggedIn())){
            console.println("Your username is: "+ user.toString());
        }
        else
        {
            console.println("Please talk to Librarian. Thank you.");
        }
    }
}
