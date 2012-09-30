// package com.thoughstworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Program {
  
  private static User u = new User();
  private static HashMap<String,String> users = new HashMap<String,String>();
  public static void main(String[] args) {
    
    while (true) {
      
      createUsers();
      printMenu();
      performMenuSelection();
      
    } 
    
  } 
  

 
  //Create_Users
  private static void createUsers() {
    
    users.put("111-1111","pass1");
    users.put("111-1112","pass2");
    users.put("111-1113","pass3");
    users.put("111-1114","pass4");
    users.put("111-1115","pass5");
    users.put("111-1116","pass6");
  }
  
  
  // PRINT-MENU
  private static void printMenu() {
    
    System.out.println("**********************************************************");
    System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
    System.out.println("**********************************************************");
    System.out.println("*                Menu                                    *");
    System.out.println("*         =====================                          *");
    System.out.println("*         1. List Book Catalog                           *");
    System.out.println("*         2. Check out Book                              *");
    System.out.println("*         3. Check Library Number                        *");
    System.out.println("*         4. Check Out Movies                            *");
    System.out.println("*         5. Login                                       *");
    System.out.println("**********************************************************");
    System.out.println("Your Selection: ");
    
    
    
  }
  
  
  

// Perform Menu-Selection 
  
  private static void performMenuSelection() {
    
    int menuSelection = getSelectionFromUser();
    
    if( isLegitimate(menuSelection) ) {
      
      if (menuSelection == 1) 
        printBookCatalog();
      
      if (menuSelection == 2) 
        checkOutBook();
      
      if (menuSelection == 3) 
        checkLibraryNumber();  
      
      if (menuSelection == 4)
        printMovieCatalog();
      
      if(menuSelection == 5) 
        performLogin();  
      
    }else 
      System.out.println("Enter a valid integer!!");
  }
  
  
// Peform Login
  
  private static void performLogin() {
    
    if( u.isAlreadyLoggedin() )
      System.out.println("You are already Logged in ");
    else
       performVerifications();
     
  }
  
  
// Perform-Verifications
  
  private static void performVerifications() {
    u = getUserDetails();
    
    boolean validUserName = users.containsKey(u.getUsername());
    String  password = users.get(u.getUsername());
    boolean validPassword;
    
    if( userNameExists(password)  && password.equals(u.getPassword()))
      validPassword = true;
    else
      validPassword = false;
    
    
    
    
    if( validUserName && validPassword ){
      u.setLegitimate(true);
      System.out.println("You are Succesfully Logged In ");
    }else {
      u.setLegitimate(false);
      System.out.println("Enter Valid UserName and PassWord ");
    }
    
    
    
  }
  
// User-Name Exists
  
  private static boolean userNameExists(String password) {
    return (password !=null);
  }
  

  
  
// User-Details
  private static User getUserDetails() {
    BufferedReader reader = createNewReader(); 
    
    System.out.println("Enter Your UserName ");
    
    String username=null;
    
    try{
      username = reader.readLine();
    }catch(Exception e) {
      System.out.println("Exception has occured");
    }
    
    System.out.println("Enter Your Password ");
    
    String password=null;
    
    try{
      password = reader.readLine();
    }catch( Exception e) {
      System.out.println("Exception has occured");
    }
    
    User u = new User();
    
    u.setUsername(username);
    u.setPassword(password);
    
    
    return u;
  }
  
  
// IS-LEGITIMATE
  private static boolean isLegitimate(int menuSelection) {
    if( menuSelection == 1 || menuSelection == 2 || menuSelection == 3 || menuSelection == 4 || menuSelection ==5)
      return true;
    else
      return false;
  }
  
  
 
  
  
  // PRINT-BOOK-CATALOG
  private static void printBookCatalog() {
    System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
    System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
    System.out.println(" 3. How to Win Friends and Influence People by Dale Carnegie ");
    System.out.println(" 4. How to Cheat at TWU Assignments by Anonymous ");
  }
  
  
  // CHECK-OUT-BOOK
  private static void checkOutBook() {
    System.out.println(" Please enter the number of the book you wish to checkout: ");
    int menuSubSelection2 = getSelectionFromUser();
    
    
    switch (menuSubSelection2) {
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("\n");
        System.out.println(" Thank You! Enjoy the book.");
        break;
      default:
        System.out.println("Sorry we don't have that book yet.");
    }
  }
  
  private static void checkLibraryNumber() {
    if(! u.isLegitimate() ){
      System.out.println("\n");
      System.out.println("Please talk to Librarian. Thank you.");
    } else {
      System.out.println("Your UserName = " + u.getUsername());
    }
    
  }
  
  
  //PRINT-MOVIE-CATALOG
  private static void printMovieCatalog() {
    
    String[] movieName = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
    String[] directorName = {"AA","BB","CC","DD","EE","FF","GG","HH","II","JJ","KK","LL","MM","NN","OO"};
    String[] rating = {"1","10","N/A","N/A","1","4","6","10","9","2","3","N/A","2","2","5"};
    
    System.out.println("(MOVIE NAME/DIRECTOR NAME/RATING(1-10))");
    for(int i=0;i<15;i++)
      System.out.println(movieName[i]+"  "+directorName[i]+"  "+rating[i]);
    
  }
  
  
  // GET-SELECTION-FROM-USER
  private static int getSelectionFromUser(){
    BufferedReader reader = createNewReader();
    try {
      return Integer.parseInt(reader.readLine());
    } catch (Exception e) {
      System.out.println("Enter a valid integer!!");
      return 0;
    } 
  }
  
  
  // CREATE-NEW-READER
  private static BufferedReader createNewReader() {
    return  new BufferedReader(new InputStreamReader(System.in));
  }
  
  
}// End Program Class


//USER-CLASS
class User {
  
  private String username;
  private String password;
  private boolean legitimate = false;
  private boolean loggedInStatus = false;
  
  public void setLegitimate(boolean val) {
    legitimate = val;
    if( val == true )
      loggedInStatus = true;
  }
  public boolean isLegitimate() {
    return this.legitimate;
  }
  
  public void setUsername(String username){
    this.username = username;
  }
  
  public void setPassword(String password ) {
    this.password = password;
  }
  
  public String getUsername() {
    return this.username;  }
  
  public String getPassword() {
    return this.password; 
  }
  
  public boolean isAlreadyLoggedin() {
    return loggedInStatus ;
  }
}