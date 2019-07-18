package com.epam.task1.action;

import com.epam.task1.init.GenerateArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

public class ArrayActionTest {

  ArrayAction arrayAction =  new ArrayAction();;
  GenerateArray generateArray = new GenerateArray();;
  double[] array;
  double[] expectedArray;

  @BeforeClass
  public void setUp() {
    array = generateArray.generateDoubleArray(100,-1000,1000);
    expectedArray = new double[array.length];
    expectedArray = array.clone();
  }


  @Test
  public void findMinimumTest() {
    double actualMinimum = arrayAction.findMinimum(array);
    double expectedMinimum = Arrays.stream(expectedArray).min().getAsDouble();
    assertNotSame(actualMinimum,expectedMinimum);
  }

  @Test
  public void findMaximumTest() {
    double actualMaximum = arrayAction.findMaximum(array);
    double expectedMaximum = Arrays.stream(array).max().getAsDouble();
    assertEquals(actualMaximum,expectedMaximum);
  }

  @Test
  public void replaceItemTest() {
//    double[] actualReplacedArray = array;
//    arrayAction.replaceItem(actualReplacedArray);
//    double[] expectedReplacedArray = ;
//    assertEquals(actualReplacedArray, expectedReplacedArray);
  }

  @Test
  public void findAverageValueTest() {
    double actualAverage = arrayAction.findAverage(array);
    double expectedAverage = Arrays.stream(expectedArray).average().getAsDouble();
    assertEquals(actualAverage,expectedAverage,1);
  }

  @Test
  public void findSumTest() {
    double[] actualArray = array.clone();
    double actualSum = arrayAction.findSum(actualArray);
    double expectedSum = 0;
    for (double num :
            expectedArray) {
      expectedSum += num;
    }
    assertEquals(actualSum,expectedSum);

  }

}