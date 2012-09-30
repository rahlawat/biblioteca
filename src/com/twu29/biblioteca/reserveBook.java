package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveBook implements Action {
    private Console console;
    private BookCollection bookCollection;
    private IUser user;

    public ReserveBook(Console console, BookCollection bookCollection, IUser user) {
        this.console = console;
        this.bookCollection = bookCollection;
        this.user = user;
    }

    public void userAction() {
        if(user.isLoggedIn())
        {
        String BookName = console.readLine( "Enter the book: ");
        if( bookCollection.searchBook(BookName))
            console.println("Thank You! Enjoy the book.");
        else
            console.println("Sorry we don't have that book yet.");
        }
        else
            console.println("Please Login First.");
    }
}
