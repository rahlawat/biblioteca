package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformPrintMovie implements Action {
    public int performAction(Console console, BibliotecaProgram bibliotecaProgram) {
        bibliotecaProgram.printMovie();
        return 4;
    }
}
