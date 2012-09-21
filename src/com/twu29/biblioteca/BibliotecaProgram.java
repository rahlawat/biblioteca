package com.twu29.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/20/12
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaProgram {
    Biblioteca biblioteca;
    UserMenu userMenu;

    public BibliotecaProgram(){
     biblioteca = new Biblioteca();
     userMenu = new UserMenu();
    }
   public void InitializeBookLog(){
       Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
       BookLog bookLog1 = new BookLog(book1,40,20);
       Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
       BookLog bookLog2 = new BookLog(book2,30,10);
       Book book3 = new Book("Design Patterns","Eric Freeman","978-81-7366-466-3");
       BookLog bookLog3 = new BookLog(book3,45,30);
       Book book4 = new Book("General Knowledge","Manohar Pandey","978-93-5075-116-9");
       BookLog bookLog4 = new BookLog(book4,20,15);
       Book book5 = new Book("When The Light Fades","Kathy Rodgers","978-18-4223-247-7") ;
       BookLog bookLog5 = new BookLog(book5,30,20);

       biblioteca.addBookLog(bookLog1);
       biblioteca.addBookLog(bookLog2);
       biblioteca.addBookLog(bookLog3);
       biblioteca.addBookLog(bookLog4);
       biblioteca.addBookLog(bookLog5);
   }

    public void InitializeReservedBook(){
        Book book1= new Book("Object-Oriented Analysis and Design","Brett D. McLaughlin","978-81-8404-221-4");
        Book book2 = new Book("The Programming Language of Oracle","Ivan Bayross","81-8333-241-2");
        Book book3 = new Book("Design Patterns","Eric Freeman","978-81-7366-466-3");
        Book book4 = new Book("General Knowledge","Manohar Pandey","978-93-5075-116-9");
        User user1 = new User("Nitin","Delhi",986894,"30 Oct 2012");
        User user2 = new User("Heena","Rohtak",2384560,"20 feb 2000");
        User user3 = new User("Varsha","Noida",28364,"14 jan 2005");

        ReservedBook reservedBook1 = new ReservedBook(book1,user1,"","");
        ReservedBook reservedBook2 = new ReservedBook(book2,user1,"","");
        ReservedBook reservedBook3 = new ReservedBook(book3,user2,"","");
        ReservedBook reservedBook4 = new ReservedBook(book4,user3,"","");

        biblioteca.addReservedBook(reservedBook1);
        biblioteca.addReservedBook(reservedBook2);
        biblioteca.addReservedBook(reservedBook3);
        biblioteca.addReservedBook(reservedBook4);
    }

    public void InitializeUser(){
        User user1 = new User("Nitin","Delhi",986894,"30 Oct 2012");
        User user2 = new User("Heena","Rohtak",2384560,"20 feb 2000");
        User user3 = new User("Varsha","Noida",28364,"14 jan 2005");

        biblioteca.addUser(user1);
        biblioteca.addUser(user2);
        biblioteca.addUser(user3);
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
        switch(UserInput)
        {
            case 1:
                   biblioteca.printBookLog();
                   return 1;

            case 2:
                   String message = "Enter the Name of the book";
                  String bookName = userMenu.getUserInput(fakeBufferedReader,message);
                  Book book = new Book(bookName,"","");
                BookLog bookLog1 = new BookLog(book,0,0);
                  BookLog bookLog = (BookLog)biblioteca.searchBook(bookLog1);
                if((bookLog != null) && (bookLog.getUnreservedCopies() > 0))
                {
                    ReservedBook reservedBook = new ReservedBook(bookLog.getBook(),new User("","",0,""),"","");
                    biblioteca.addReservedBook(reservedBook);
                    System.out.println("Thank You! Enjoy the book.");
                    return 2;
                }
                else  {
                System.out.println("Sorry we don't have that book yet.");
                    return 0;
                }

            case 3:
                System.out.println("Contact Details");
                System.out.println("Librarian: +91-9868320024");
                return 3;

            default:
                System.out.println("Select a valid option!!");
                return 4;

        }
    }
}
