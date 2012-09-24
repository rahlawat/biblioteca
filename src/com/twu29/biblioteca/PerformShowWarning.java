package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformShowWarning implements Action {
   @Override
   public int performAction(Console console, BibliotecaProgram bibliotecaProgram) {
        System.out.println("Select a valid option!!");
        return -1;
    }
}
