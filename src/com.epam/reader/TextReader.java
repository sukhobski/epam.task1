package com.epam.reader;

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

  public String readTextFile(String filePath, int numberOfLine) {
    try {
      return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8).get(numberOfLine);
    } catch (IOException e) {
      System.err.printf("File not found");
      return null;
    }
  }
}