package com.twu29.biblioteca;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Book> bookList;
    private List<User> userList;
    private List<Movie> movieList;

    public Biblioteca(){
        bookList = new LinkedList<Book>();
        userList = new LinkedList<User>();
        movieList = new LinkedList<Movie>();
    }

    public boolean addBook(Book book) {
       this.bookList.add(book);
        return true;
    }

    public boolean addUser(User user) {
         this.userList.add(user);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean searchBook(String userInput) {
        Book book= new Book(userInput,null,null);
        for(Iterator i = bookList.iterator();i.hasNext();){
            Book book1 = (Book)i.next();
            if(book.matches(book1))
                return true;
        }
        return false;
    }


    public boolean searchUser(User user) {
        for(Iterator i = userList.iterator();i.hasNext();){
            User user1 = (User)i.next();
            if(user.matches(user1))
                return true;
        }
        return false;
    }

    public boolean printBook() {
        for(Iterator i = bookList.iterator();i.hasNext();){
          Book book = (Book)i.next();
          book.printBook();
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
            movie.printMovie();
        }
    }
}
