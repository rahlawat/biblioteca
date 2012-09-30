package com.twu29.biblioteca;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaLibrary {
    IUser user;
    private final BookCollection bookCollection;
    private final MovieCollection movieCollection;
    private final UserCollection userCollection;
    private Console console;


    public BibliotecaLibrary(Console console){
      user = new AnonymousUser();
      this.console = console;
     bookCollection = new BookCollection();
     movieCollection = new MovieCollection();
     userCollection = new UserCollection();
    }

   public void InitializeBookLog(){
       Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
       Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
       Book book3 = new Book("Design Patterns","Eric Freeman","978-81-7366-466-3");
       Book book4 = new Book("General Knowledge","Manohar Pandey","978-93-5075-116-9");
       Book book5 = new Book("When The Light Fades","Kathy Rodgers","978-18-4223-247-7") ;

       bookCollection.addBook(book1);
       bookCollection.addBook(book2);
       bookCollection.addBook(book3);
       bookCollection.addBook(book4);
       bookCollection.addBook(book5);
   }

    public void InitializeUser(){
        User user1 = new User("111-1111","Apass");
        User user2 = new User("111-1112","Bpass");
        User user3 = new User("111-1113","Cpass");
        User user4 = new User("111-1114","Dpass");
        User user5 = new User("111-1116","Epass");

        userCollection.addUser(user1);
        userCollection.addUser(user2);
        userCollection.addUser(user3);
        userCollection.addUser(user4);
        userCollection.addUser(user5);
    }

    public void InitializeMovie() {
        Movie movie = new Movie("Players",2012,"Abbas-Mustan","5");
        Movie movie1 = new Movie("Heroine",2012,"Madhur Bhandarkar","N/A");
        Movie movie2 = new Movie("Halla Bol",2008,"Rajkumar Santoshi","6");
        Movie movie3 = new Movie("Bade Miyan Chote Miyan",1998,"David Dhawan","7");
        Movie movie4 = new Movie("Dil Se",1998,"Mani Ratnam","9");
        Movie movie5 = new Movie("Chak De India",2007,"Shimit Amin","10");
        Movie movie6 = new Movie("Ek Chalis Ki Last Local",2007,"Sanjay Khanduri","8");
        Movie movie7 = new Movie("Khamoshi: The Musical",1996,"Sanjay Leela Bhansali","9");
        Movie movie8 = new Movie("Phool Bane Pathar",1998,"Ambrish Sangal","5");
        Movie movie9 = new Movie("My Name Is Khan",2010,"Karan Johar","10");
        Movie movie10 = new Movie("Raja Hindustani",1997,"Dharmesh Darshan","10");
        Movie movie11 = new Movie("Jab We Met",2007,"Imtiaz Ali","10");
        Movie movie12 = new Movie("Lafagey Parindey",2010,"Pradeep Sarkar","6");
        Movie movie13 = new Movie("Rajneeti",2010,"Prakash Jha","9");
        Movie movie14 = new Movie("Life In A Metro",2007,"Anurag Basu","10");

        movieCollection.addMovie(movie);
        movieCollection.addMovie(movie1);
        movieCollection.addMovie(movie2);
        movieCollection.addMovie(movie3);
        movieCollection.addMovie(movie4);
        movieCollection.addMovie(movie5);
        movieCollection.addMovie(movie6);
        movieCollection.addMovie(movie7);
        movieCollection.addMovie(movie8);
        movieCollection.addMovie(movie9);
        movieCollection.addMovie(movie10);
        movieCollection.addMovie(movie11);
        movieCollection.addMovie(movie12);
        movieCollection.addMovie(movie13);
        movieCollection.addMovie(movie14);
    }


    public void StartLibrary(String userInput){
        performaction(userInput);
    }

    public void performaction(String UserInput) {
        HashMap<String,Action> generateAction= new HashMap<String,Action>();
        generateAction.put("1", new Login(console,userCollection,this));
        generateAction.put("2",new PrintBooks(console,bookCollection));
        generateAction.put("3",new ReserveBook(console,bookCollection,user));
        generateAction.put("4",new PrintMovies(console,movieCollection));
        generateAction.put("5",new CheckLibraryNumber(console,user));
        generateAction.put("6",new ShowWarning(console));
        (generateAction.get(UserInput)).userAction();
    }
}
