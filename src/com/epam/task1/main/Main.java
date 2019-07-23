package com.epam.task1.main;

import com.epam.task1.reader.TextReader;
import com.epam.task1.writer.TextWriter;

import java.io.IOException;


public class Main {
  public static void main(String[] args) throws IOException {

    TextWriter textWriter = new TextWriter("./data/output.txt");
    textWriter.appendTextInFile("first");
    textWriter.appendTextInFile("second");
    textWriter.appendTextInFile("123133467678676");


  }
}
