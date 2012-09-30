package com.twu29.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserMenu {
    private String WelcomeNote = "Welcome To Biblioteca";
    private String[] menuItem = {"Login","List Of Books","Select Book","Movie Catalog","Contact","Quit"};
    private Console console;

    public UserMenu(Console console){
         this.console = console;
    }
    public String DisplayWelcomeNote() {
        console.println(WelcomeNote);
        return WelcomeNote;
    }

    public String Display() {
        String separator = System.getProperty("line.separator");
        String PrintMenu = "1. "+menuItem[0]+separator+"2. "+menuItem[1]+separator+"3. "+menuItem[2]+separator+"4. "+menuItem[3]+separator+"5. "+menuItem[4]+separator+"6. "+menuItem[5];
        console.println(PrintMenu);
        return PrintMenu;
    }

}
