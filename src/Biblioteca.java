import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<BooksLogs> booksLogsList;
    private List<ReservedBooks> reservedBooksList;
    private List<User> userList;

    public Biblioteca(){
        booksLogsList = new LinkedList<BooksLogs>();
        reservedBooksList = new LinkedList<ReservedBooks>();
        userList = new LinkedList<User>();
    }

    public boolean addBookLog(BooksLogs booksLogs) {
       this.booksLogsList.add(booksLogs);
        return true;
    }

    public boolean addReservedBook(ReservedBooks reservedBooks) {
        this.reservedBooksList.add(reservedBooks);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }


    public boolean addUser(User user) {
         this.userList.add(user);
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public BooksLogs searchBook(BooksLogs booksLogs) {
         for(Iterator i = booksLogsList.iterator();i.hasNext();){
             BooksLogs booksLogs1 = (BooksLogs)i.next();
             if(booksLogs.matches(booksLogs1))
                 return booksLogs1;
         }
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public ReservedBooks searchReservedBooks(ReservedBooks reservedBooks) {
        List matchingReservedBooks = new LinkedList();
        for(Iterator i = reservedBooksList.iterator(); i.hasNext();)
        {
            ReservedBooks reservedBooks1 = (ReservedBooks)i.next();
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
}
