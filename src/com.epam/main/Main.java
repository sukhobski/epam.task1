package com.epam.main;

import com.epam.action.ArrayAction;
import com.epam.init.InitArray;
import com.epam.parser.Parsers;
import com.epam.printer.ConsolePrinter;
import com.epam.reader.TextReader;

import java.io.IOException;
import java.util.List;


public class Main {

  public static void main(String[] args) throws IOException {


    ArrayAction arrayAction = new ArrayAction();
    Parsers parsers = new Parsers();
    ConsolePrinter consolePrinter = new ConsolePrinter();
    InitArray initArray = new InitArray();

    List<String> lines = new TextReader().readTextFile("./data/inputNumbers.txt");
    parsers.parseListFile(lines);
    for (String line :
            lines) {
      double[] array = parsers.convertArrayStringToDouble(line);
      for (double number :
              array) {
        System.out.print(number + " ");
      }
      System.out.println();
    }

  }
}