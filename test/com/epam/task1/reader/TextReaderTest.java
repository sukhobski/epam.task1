package com.epam.task1.reader;

import com.epam.task1.exception.InvalidFileException;
import com.epam.task1.exception.InvalidNumberOfLineException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextReaderTest {

  @DataProvider
  public Object[][] wrongData() {
    return new Object[][] {
            {"."},
            {"/fdsf"},
            {"./data/inputNumbers.tx"},
    };
  }

  @Test(dataProvider = "wrongData", expectedExceptions = InvalidFileException.class)
  public void testReadTextFile(String path) throws InvalidFileException {
    new TextReader().readTextFile(path);
  }

  @DataProvider
  public Object[][] dataReadLineFromTextFile() {
    return new Object[][]{
            {-1},
            {-43},
            {4},
            {50}
    };
  }

  @Test(dataProvider = "dataReadLineFromTextFile", expectedExceptions = InvalidNumberOfLineException.class)
  public void testReadLineFromTextFile(int numberOfLine) throws InvalidNumberOfLineException {
    List<String> lines = new ArrayList<>();
    lines.add("first");
    lines.add("second");
    lines.add("third");
    lines.add("fourth");
    new TextReader().readLineFromTextFile(lines,numberOfLine);
  }
}