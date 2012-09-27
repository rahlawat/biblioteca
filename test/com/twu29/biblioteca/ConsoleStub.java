package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/24/12
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleStub implements Console{
    HashMap<String,String> input = new HashMap<String, String>();
     List<String> outputLines = new ArrayList<String>();

    public ConsoleStub(String Choice){
       input.put("Enter your name: ","111-1113");
       input.put("Enter your password: ","Cpass");
       input.put("Enter the book: ","The Programming Language of Oracle");
       input.put("Enter your choice: ",Choice);
    }
    @Override
    public String readLine(String text) {
        if(input.containsKey(text)) {
            return input.get(text);
        }
        return null;
    }

    @Override
    public void println(String text) {
       outputLines.add(text);
    }

    public boolean isPrinted(String text){
        for (Iterator i = outputLines.iterator(); i.hasNext(); ) {
            String output = (String) i.next();
            if (output.equals(text))
                return true;
        }
        return false;
    }
}
