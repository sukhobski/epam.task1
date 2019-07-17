package com.epam.task1.main;

import com.epam.task1.action.ArrayAction;
import com.epam.task1.parser.Parsers;
import com.epam.task1.printer.ConsolePrinter;
import com.epam.task1.reader.TextReader;
import com.epam.task1.init.InitArray;

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