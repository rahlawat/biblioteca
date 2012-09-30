package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 1:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformActionTest {

    @Test
    public void testPerformBookSelection() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BookCollection bookCollection = new BookCollection();
        Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
        Book book3 = new Book("Design Patterns","Eric Freeman","978-81-7366-466-3");

        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        bookCollection.addBook(book3);
        IUser user = new User("111-1111","Apass");
        ReserveBook performBookSelection = new ReserveBook(consoleStub,bookCollection,user);
        performBookSelection.userAction();
        Assert.assertTrue(consoleStub.isPrinted("Please Login First."));
    }

    @Test
    public void testPerformLogin() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(consoleStub);
        UserCollection userCollection =new UserCollection();
        User user1 = new User("111-1111","Apass");
        User user2 = new User("111-1112","Bpass");
        User user3 = new User("111-1113","Cpass");

        userCollection.addUser(user1);
        userCollection.addUser(user2);
        userCollection.addUser(user3);
        Login login = new Login(consoleStub,userCollection, bibliotecaLibrary);
        login.userAction();
        Assert.assertTrue(consoleStub.isPrinted("You are successfully logged in."));
    }

    @Test
    public void testcheckLibraryNumber() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        User user1 = new User("111-1111","Apass");
        CheckLibraryNumber checkLibraryNumber = new CheckLibraryNumber(consoleStub,user1);
        checkLibraryNumber.userAction();
        Assert.assertTrue(consoleStub.isPrinted("Please talk to Librarian. Thank you."));
    }

    @Test
    public void testPrintBook() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        BookCollection bookCollection = new BookCollection();
        Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");

        bookCollection.addBook(book1);
        bookCollection.addBook(book2);
        PrintBooks performPrintBook = new PrintBooks(consoleStub,bookCollection);
        performPrintBook.userAction();
        Assert.assertTrue(consoleStub.isPrinted("Object-Oriented Analysis and Design    Brett D. McLaughlin    978-81-8404-221-4"));
    }

    @Test
    public void testPerformPrintMovie() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        MovieCollection movieCollection = new MovieCollection();
        Movie movie = new Movie("Dil Se",1998,"Mani Ratnam","9");
        Movie movie1 = new Movie("Heroine",2012,"Madhur Bhandarkar","N/A");

        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie1);
        PrintMovies performPrintMovie = new PrintMovies(consoleStub,movieCollection);
        performPrintMovie.userAction();
       Assert.assertTrue(consoleStub.isPrinted("Dil Se    1998    Mani Ratnam    9"));
    }

    @Test
    public void testPerformShowWarning() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        ShowWarning performShowWarning = new ShowWarning(consoleStub);
        performShowWarning.userAction();
        Assert.assertTrue(consoleStub.isPrinted("Select a valid option!!"));
    }
}
