package com.epam.task1.printer;

public class ConsolePrinter {

  public void printArray(double[] array) {
    for (double number :
            array) {
      System.out.printf("%5.1f   ", number);
    }
    System.out.println();
  }

  public void printArray(String message, double[] array) {
    for (double number :
            array) {
      System.out.printf("%5.1f   ", number);
    }
    System.out.printf("<-- %s%n", message);
  }

  public void printResult(double value) {
    System.out.printf("%5.1f", value);
  }

  public void printResult(String message, double value) {
    System.out.printf("%s : %5.1f%n", message, value);
  }

}
