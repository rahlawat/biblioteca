package com.twu29.biblioteca;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<BookLogSchema> bookLogList;
    private List<User> userList;
    private List<Movie> movieList;

    public Biblioteca(){
        bookLogList = new LinkedList<BookLogSchema>();
        userList = new LinkedList<User>();
        movieList = new LinkedList<Movie>();
    }

    public boolean addBookLog(BookLogSchema booksLogs) {
       this.bookLogList.add(booksLogs);
        return true;
    }

    public boolean addUser(User user) {
         this.userList.add(user);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void searchBook(int userInput) {
         if(userInput <= bookLogList.size())
             System.out.println("Enjoy The Book.");
        if(userInput > bookLogList.size())
            System.out.println("Sorry we don't have that book yet.");
          //To change body of created methods use File | Settings | File Templates.
    }


    public boolean searchUser(User user) {
        for(Iterator i = userList.iterator();i.hasNext();){
            User user1 = (User)i.next();
            if(user.matches(user1))
                return true;
        }
        return false;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean printBookLog() {
        for(Iterator i = bookLogList.iterator();i.hasNext();){
          BookLogSchema bookLog = (BookLogSchema)i.next();
            BookSchema book =   (BookSchema)bookLog.getBook();
            System.out.println("Name of Book: "+book.getTitle()+" Author: "+book.getAuthor()+ " ISBN: "+book.getISBN()+" Total Books: "+bookLog.getTotalCopies()+" Books Available: "+bookLog.getUnreservedCopies());
        }
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean addMovie(Movie movie) {
        this.movieList.add(movie);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void printMovie() {
        for(Iterator i = movieList.iterator();i.hasNext();){
            Movie movie = (Movie)i.next();
            System.out.println(movie.getMovieName()+"    "+movie.getMovieYear()+"    "+movie.getMovieDirector()+"    "+movie.getMovieRating() );
        }
    }
}
