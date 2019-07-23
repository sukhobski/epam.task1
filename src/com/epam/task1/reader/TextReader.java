package com.epam.task1.reader;


import com.epam.task1.exception.InvalidFileException;
import com.epam.task1.exception.InvalidNumberOfLineException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {

  public List<String> readTextFile(String filePath) throws InvalidFileException {
    try {
      return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new InvalidFileException();
    }
  }

  public String readLineFromTextFile(List<String> lines, int numberOfLine) throws InvalidNumberOfLineException {
    if (numberOfLine < 0 || numberOfLine >= lines.size()) {
      throw new InvalidNumberOfLineException();
    }
    return lines.get(numberOfLine);
  }

}