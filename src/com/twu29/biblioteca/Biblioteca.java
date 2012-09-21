package com.twu29.biblioteca;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<BookLogSchema> bookLogList;
    private List<ReservedBookSchema> reservedBooksList;
    private List<User> userList;

    public Biblioteca(){
        bookLogList = new LinkedList<BookLogSchema>();
        reservedBooksList = new LinkedList<ReservedBookSchema>();
        userList = new LinkedList<User>();
    }

    public boolean addBookLog(BookLogSchema booksLogs) {
       this.bookLogList.add(booksLogs);
        return true;
    }

    public boolean addReservedBook(ReservedBookSchema reservedBooks) {
        this.reservedBooksList.add(reservedBooks);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }


    public boolean addUser(User user) {
         this.userList.add(user);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public BookLogSchema searchBook(BookLogSchema booksLogs) {
         for(Iterator i = bookLogList.iterator();i.hasNext();){
             BookLogSchema booksLogs1 = (BookLogSchema)i.next();
             if(booksLogs.matches(booksLogs1))
                 return booksLogs1;
         }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public ReservedBookSchema searchReservedBooks(ReservedBookSchema reservedBooks) {
        List matchingReservedBooks = new LinkedList();
        for(Iterator i = reservedBooksList.iterator(); i.hasNext();)
        {
            ReservedBookSchema reservedBooks1 = (ReservedBookSchema)i.next();
            if(reservedBooks.matches(reservedBooks1))  {
                matchingReservedBooks.add(reservedBooks1);
                return reservedBooks;
            }
        }
        return null;
        //return matchingReservedBooks;  //To change body of created methods use File | Settings | File Templates.
    }


    public User searchUser(User user) {
        for(Iterator i = userList.iterator();i.hasNext();){
            User user1 = (User)i.next();
            if(user.matches(user1))
                return user1;
        }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean printBookLog() {
        for(Iterator i = bookLogList.iterator();i.hasNext();){
          BookLogSchema bookLog = (BookLog)i.next();
            Book book =   (Book)bookLog.getBook();
            System.out.println("Name of Book: "+book.getTitle()+" Author: "+book.getAuthor()+ " ISBN: "+book.getISBN()+" Total Books: "+bookLog.getTotalCopies()+" Books Available: "+bookLog.getUnreservedCopies());
        }
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
