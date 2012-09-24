package com.twu29.biblioteca;

import java.io.BufferedReader;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaProgram {
    User user;
    Biblioteca biblioteca;
    UserMenu userMenu;

    public BibliotecaProgram(){
     biblioteca = new Biblioteca();
     userMenu = new UserMenu();
    }
   public void InitializeBookLog(){
       Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
       Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
       Book book3 = new Book("Design Patterns","Eric Freeman","978-81-7366-466-3");
       Book book4 = new Book("General Knowledge","Manohar Pandey","978-93-5075-116-9");
       Book book5 = new Book("When The Light Fades","Kathy Rodgers","978-18-4223-247-7") ;

       biblioteca.addBook(book1);
       biblioteca.addBook(book2);
       biblioteca.addBook(book3);
       biblioteca.addBook(book4);
       biblioteca.addBook(book5);
   }

    public void InitializeUser(){
        User user1 = new User("111-1111","Apass");
        User user2 = new User("111-1112","Bpass");
        User user3 = new User("111-1113","Cpass");
        User user4 = new User("111-1114","Dpass");
        User user5 = new User("111-1116","Epass");
        User user6 = new User("1","1")   ;

        biblioteca.addUser(user1);
        biblioteca.addUser(user2);
        biblioteca.addUser(user3);
        biblioteca.addUser(user4);
        biblioteca.addUser(user5);
        biblioteca.addUser(user6);
    }

    public int StartLibrary(BufferedReader fakeBufferedReader){
        userMenu.DisplayWelcomeNote();
        userMenu.DisplayMenu();
       int UserInput =Integer.parseInt(userMenu.getUserInput(fakeBufferedReader,"Enter your choice: "));
        System.out.println(UserInput);
       int out = PerformAction(UserInput,fakeBufferedReader);
        return out;
    }

    public int PerformAction(int UserInput,BufferedReader fakeBufferedReader) {
         if(UserInput == 1){
              login(fakeBufferedReader);
              return 1;
         }
         if(UserInput == 2){
             biblioteca.printBook();
              return 2;
         }
        if(UserInput == 3)
        {
           String BookName = userMenu.getUserInput(fakeBufferedReader,"Enter the book: ");
           boolean found = biblioteca.searchBook(BookName);
            if(found == true)
                System.out.println("Thank You! Enjoy the book.");
            else
                System.out.println("Sorry we don't have that book yet.");
           return 3;
        }
         if(UserInput == 4){
               biblioteca.printMovie();
             return 4;
         }
         if(UserInput == 5){
           getDetails();
             return 5;
         }
        if(UserInput >5){
                System.out.println("Select a valid option!!");
                return -1;
        }
        return 0;
    }
    public void getDetails() {
        if((user != null) && ((user.isLoggedIn()) || biblioteca.searchUser(user)) ){
            System.out.println("Your username is: "+ user.getName());
        }
        else
        {
            System.out.println("Please talk to Librarian. Thank you.");
        }
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

        biblioteca.addMovie(movie);
        biblioteca.addMovie(movie1);
        biblioteca.addMovie(movie2);
        biblioteca.addMovie(movie3);
        biblioteca.addMovie(movie4);
        biblioteca.addMovie(movie5);
        biblioteca.addMovie(movie6);
        biblioteca.addMovie(movie7);
        biblioteca.addMovie(movie8);
        biblioteca.addMovie(movie9);
        biblioteca.addMovie(movie10);
        biblioteca.addMovie(movie11);
        biblioteca.addMovie(movie12);
        biblioteca.addMovie(movie13);
        biblioteca.addMovie(movie14);
    }

    public boolean login(BufferedReader fakeBufferedReader) {
        boolean loggedin = false;
        if((user!= null) && (user.isLoggedIn() == true)){
            System.out.println("You are already Logged in");
        }
        else
        {
           loggedin = getUserDetails(fakeBufferedReader);
            if(loggedin == true)
                System.out.println("You are successfully logged in.");
            else
                System.out.println("Username/Password is Wrong.");
        }
        return loggedin;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean getUserDetails(BufferedReader fakeBufferedReader) {
        String name =  userMenu.getUserInput(fakeBufferedReader,"Enter your name: ");
        String password = userMenu.getUserInput(fakeBufferedReader,"Enter yout password: ");

        user = new User(name,password);

        boolean logged = biblioteca.searchUser(user);
        return logged;

    }
}
