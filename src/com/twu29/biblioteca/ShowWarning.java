package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class ShowWarning implements Action {
    private Console console;

    public ShowWarning(Console console) {
        this.console = console;
    }

    @Override
   public void userAction() {
        console.println("Select a valid option!!");
    }
}
