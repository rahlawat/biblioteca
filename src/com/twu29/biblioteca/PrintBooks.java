package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrintBooks implements Action {
    private Console console;
    private BookCollection bookCollection;

    public PrintBooks(Console console, BookCollection bookCollection) {
        this.console = console;
        this.bookCollection = bookCollection;
    }

    public void userAction() {
        for(int index=0;index < bookCollection.count();index++)   {
            console.println(bookCollection.bookInformation(index));
        }
    }
}
