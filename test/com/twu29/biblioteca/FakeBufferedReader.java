package com.twu29.biblioteca;

import java.io.BufferedReader;
import java.io.Reader;

public class FakeBufferedReader extends BufferedReader {
    public FakeBufferedReader(Reader in) {
        super(in);
    }
    public String readLine(){
        return "1";
    }
}
