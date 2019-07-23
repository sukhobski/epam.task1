package com.epam.task1.action;

import com.epam.task1.init.GenerateArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

import static org.testng.Assert.*;

public class IntStreamActionTest {

  IntStream intStream = IntStream.of(1, 2, 3);
  IntStreamAction intStreamAction = new IntStreamAction(intStream);

  @Test
  public void testFindAverage() {
    double actualValue = intStreamAction.findAverage();
    double expectedValue = 2;
    assertEquals(actualValue, expectedValue);
  }

  @Test
  public void testFindMin() {
    double actualValue = intStreamAction.findMin();
    double expectedValue = 1;
    assertEquals(actualValue, expectedValue);
  }

  @Test
  public void testFindMax() {
    double actualValue = intStreamAction.findMax();
    double expectedValue = 3;
    assertEquals(actualValue, expectedValue);
  }

}