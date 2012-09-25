package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformBookSelection implements Action {
   public int performAction(Console console, BibliotecaProgram bibliotecaProgram) {
        String BookName = bibliotecaProgram.getUserInput(console, "Enter the book: ");
        boolean found = bibliotecaProgram.searchBook(BookName);
        if(found == true)
            System.out.println("Thank You! Enjoy the book.");
        else
            System.out.println("Sorry we don't have that book yet.");
        return 3;
    }
}