package com.twu29.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/28/12
 * Time: 12:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class SysConsole implements Console {
    @Override
    public String readLine(String text) {
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine. length () == 0) return null;
        } catch (IOException e) {
                System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    @Override
    public void println(String text) {
        System.out.println(text);
    }
}
