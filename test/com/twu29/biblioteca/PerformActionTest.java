package com.twu29.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/25/12
 * Time: 1:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class PerformActionTest {
    @Test
    public void testPerformAction() {
        ConsoleStub consoleStub = new ConsoleStub("1");
        List<Action> action = new LinkedList<Action>();
        BibliotecaProgram bibliotecaProgram = new BibliotecaProgram();
        bibliotecaProgram.InitializeBookLog();
        bibliotecaProgram.InitializeUser();
        bibliotecaProgram.InitializeMovie();
        action.add(new PerformBookSelection());
        action.add(new PerformGetDetails());
        action.add(new PerformLogin());
        action.add(new PerformPrintBook());
        action.add(new PerformPrintMovie());
        action.add(new PerformShowWarning());

        Assert.assertEquals(3, action.get(0).performAction(consoleStub, bibliotecaProgram));
        Assert.assertEquals(5,action.get(1).performAction(consoleStub,bibliotecaProgram));
        Assert.assertEquals(1, action.get(2).performAction(consoleStub, bibliotecaProgram));
        Assert.assertEquals(2, action.get(3).performAction(consoleStub, bibliotecaProgram));
        Assert.assertEquals(4, action.get(4).performAction(consoleStub, bibliotecaProgram));
        Assert.assertEquals(-1, action.get(5).performAction(consoleStub, bibliotecaProgram));
    }
}
