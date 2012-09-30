package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Login implements Action {
    private Console console;
    private UserCollection userCollection;
    private BibliotecaLibrary bibliotecaLibrary;

    public Login(Console console, UserCollection userCollection, BibliotecaLibrary bibliotecaLibrary) {
        this.console = console;
        this.userCollection = userCollection;
        this.bibliotecaLibrary = bibliotecaLibrary;
    }

    public void userAction() {
        if(bibliotecaLibrary.user.isLoggedIn()){
            console.println("You are already Logged in");
        }
        else
        {
            AuthenticateUser();
        }
    }

    private void AuthenticateUser() {
        String name =  console.readLine("Enter your name: ");
        String password = console.readLine("Enter your password: ");
        bibliotecaLibrary.user = new User(name,password);
        if(userCollection.Authenticate(bibliotecaLibrary.user))
        {
            console.println("You are successfully logged in.");
        }
        else
            console.println("Username/Password is Wrong.");
    }
}
