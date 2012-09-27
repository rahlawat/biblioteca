package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformGetDetails implements Action {

   public void performAction(Console console, BibliotecaProgram bibliotecaProgram) {
        bibliotecaProgram.getDetails(console);
    }
}
