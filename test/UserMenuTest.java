import junit.framework.Assert;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class UserMenuTest {

    @Test
    public void testDisplayWelcomeNote() throws Exception {
        UserMenu capture;
        capture = new UserMenu();
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        capture.DisplayWelcomeNote("Welcome to Biblioteca.");
        Assert.assertEquals("Welcome to Biblioteca.", os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

    @Test
    public void testDisplayMenu() throws Exception {
        UserMenu capture;
        capture = new UserMenu();
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        // Perform tests
        String separator = System.getProperty("line.separator");
        capture.DisplayMenu("Search" + separator + "Reserve" + separator + "Return" + separator + "Contact");
        Assert.assertEquals("Search"+separator+"Reserve"+separator+"Return"+separator+"Contact"+separator, os.toString());
        // Restore normal operation
        System.setOut(originalOut);
    }

    @Test
    public void testgetUserInput() throws Exception {
        UserMenu userMenu;
       userMenu = new UserMenu();
        FakeBufferedReader fakeBufferedReader = new FakeBufferedReader(new InputStreamReader(System.in));
        Assert.assertEquals("Reserve",userMenu.getUserInput(fakeBufferedReader));

    }


}
