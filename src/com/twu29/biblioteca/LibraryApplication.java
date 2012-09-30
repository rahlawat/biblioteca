package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/30/12
 * Time: 8:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryApplication {
   private static Console console = new SystemConsole();
  private static   BibliotecaLibrary bibliotecaLibrary = new BibliotecaLibrary(console);
   private static UserMenu userMenu = new UserMenu(console);

    public static void main(String[] args){
        bibliotecaLibrary.InitializeBookLog();
        bibliotecaLibrary.InitializeUser();
        bibliotecaLibrary.InitializeMovie();
        userMenu.DisplayWelcomeNote();
        userMenu.Display();
        String UserInput =console.readLine("Enter your choice: ");
        do{
            bibliotecaLibrary.StartLibrary(UserInput);
            UserInput =console.readLine("Enter your choice: ");
        }while(Integer.parseInt(UserInput) < 6);
    }

}
