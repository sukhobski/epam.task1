package com.epam.task1.parser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TextParserTest {

  TextParser textParser = new TextParser();

  @Test
  public void RemoveIncorrectLinesTest() {
    String inputLine = "32.0 45.0 56.0 76.087.0 88.0 -12.0 0.0 -7.0 3.0 1232.0 45.0 56.0 76.0\n";
    assertTrue(textParser.isLineValid(inputLine));
  }
}