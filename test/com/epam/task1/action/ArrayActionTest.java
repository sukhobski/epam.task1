package com.epam.task1.action;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArrayActionTest {

  ArrayAction arrayAction;
  double[] array = {32.0, 45.0, 56.0, 76.0, 87.0, 88.0, -12.0, 0.0, -7.0, 3.0, 12.0};
  double[] expectedArray = new double[array.length];


  @BeforeClass
  public void setUp() {
    arrayAction = new ArrayAction();
    Arrays.sort(expectedArray);
  }


  @Test
  public void findMinimumTest() {
    double actualMinimumNumber = arrayAction.findMinimum(array);
    double expectedMinimumNumber = Arrays.stream(array).min().getAsDouble();
    assertEquals(actualMinimumNumber,expectedMinimumNumber);
  }

  @Test
  public void findMaximumTest() {
    double actualMaximumNumber = arrayAction.findMaximum(array);
    double expectedMinimumNumber = Arrays.stream(array).max().getAsDouble();
    assertEquals(actualMaximumNumber,expectedMinimumNumber);
  }

  @Test
  public void replaceItemTest() {
  }

  @Test
  public void findAverageValueTest() {
  }

  @Test
  public void findSumTest() {
  }
}