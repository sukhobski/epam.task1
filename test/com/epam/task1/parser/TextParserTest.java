package com.epam.task1.parser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TextParserTest {

  private TextParser textParser = new TextParser();

  @DataProvider
  public Object[][] isLineValidData(){
    return new Object[][]{
            {"32.0 45.0 56.0 76.0 87.0 88.0 -12.0 0.0 -7.0 3.0 12.0"},
            {"1 2 3 0 -50 0.001"},
            {"0     6 3"}
    };
  }

  @Test(dataProvider = "isLineValidData")
  public void isLineValidTest(String inputLine) {
    boolean actualValue = textParser.isLineValid(inputLine);
    assertTrue(actualValue);
  }


  @Test
  public void testRemoveIncorrectLines() {
  }
}