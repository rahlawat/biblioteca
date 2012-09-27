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
   public void performAction(Console console, BibliotecaProgram bibliotecaProgram) {
        console.println("Select a valid option!!");
    }
}
