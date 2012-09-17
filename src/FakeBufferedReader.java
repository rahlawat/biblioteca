import java.io.BufferedReader;
import java.io.Reader;

public class FakeBufferedReader extends BufferedReader {
    public FakeBufferedReader(Reader in) {
        super(in);
    }
    public String readLine(){
        return "Reserve";
    }
}
