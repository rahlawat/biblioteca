import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserMenu {
    private String WelcomeNote = "Welcome To Biblioteca";
    // private String[] menuItem = {"Search","Reserve","Return","Contact"};

    public void DisplayWelcomeNote(String welcome) {
        System.out.print(welcome);
    }

    public void DisplayMenu(String menu) {
        System.out.println(menu);
    }

    public String getUserInput(BufferedReader bufferedReader) {
        String inputLine = null;
        try{
            BufferedReader bfr = bufferedReader;
            inputLine = bfr.readLine();
            if(inputLine.length()==0){
                return null;
            }
        }  catch(IOException e) {
            System.out.println("IOException e: "+ e);
        }
        return inputLine;
    }
}
