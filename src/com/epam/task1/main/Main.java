package com.epam.task1.main;

import com.epam.task1.action.ArrayAction;
import com.epam.task1.init.GenerateArray;
import com.epam.task1.parser.TextParser;
import com.epam.task1.printer.ConsolePrinter;
import com.epam.task1.reader.TextReader;

import java.io.IOException;
import java.util.List;


public class Main {

  public static void main(String[] args) throws IOException {


    ArrayAction arrayAction = new ArrayAction();
    TextParser textParser = new TextParser();
    ConsolePrinter consolePrinter = new ConsolePrinter();
    GenerateArray generateArray = new GenerateArray();

    List<String> lines = new TextReader().readTextFile("./data/inputNumbers.txt");
//    textParser.removeIncorrectLines(lines);
    for (String line :
            lines) {
//      double[] array = textParser.convertArrayStringToDouble(line);
//      for (double number :
//              array) {
//        System.out.print(number + " ");
      System.out.print(line);
      System.out.println(" " + textParser.isLineValid(line));
      }
      System.out.println();
  }

}
