package com.epam.reader;

import com.epam.exception.InvalidNumberOfLineException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {

  public List<String> readTextFile(String filePath) {
    try {
      return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.err.printf("File not found");
      return null;
    }
  }

  public String readLineFromTextFile(String filePath, int numberOfLine) {
    List<String> textFile = readTextFile(filePath);
    try {
      return textFile.get(numberOfLine);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Incorrect line");
    }
    return null;
  }

}