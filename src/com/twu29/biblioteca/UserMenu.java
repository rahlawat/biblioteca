package com.twu29.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserMenu {
    private String WelcomeNote = "Welcome To Biblioteca";
    private String[] menuItem = {"List Of Books","Reserve","Contact"};

    public String DisplayWelcomeNote() {
        System.out.println(WelcomeNote);
        return WelcomeNote;
    }

    public String DisplayMenu() {
        String separator = System.getProperty("line.separator");
        String PrintMenu = "1. "+menuItem[0]+separator+"2. "+menuItem[1]+separator+"3. "+menuItem[2];
        System.out.println(PrintMenu);
        return PrintMenu;
    }

    public String getUserInput(BufferedReader bufferedReader,String message) {
        String inputLine = null;
        System.out.println(message);
        try{
            BufferedReader bfr = bufferedReader;
            inputLine = bfr.readLine();
            if(inputLine.length()==0){
                return null;
            }
        }  catch(IOException e) {
            System.out.println("IOException e: "+ e);
        }
        //System.out.println(inputLine);
        return "1";
    }
}
