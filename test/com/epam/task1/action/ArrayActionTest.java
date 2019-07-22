package com.epam.task1.action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

public class ArrayActionTest {

  private ArrayAction arrayAction =  new ArrayAction();

  @DataProvider
  public Object[][] findMinimumData(){
    return new Object[][]{
            {new double[]{1, 3, 4, -12, 4, 6, 8, -4, 0, 3}, -12},
            {new double[]{1,2,3}, 1},
            {new double[]{-5, -78, 0, -99}, -99}
    };
  }
  @Test(dataProvider = "findMinimumData")
  public void findMinimumTest(double[] inputArray, double expectedValue) {
    double actualValue = arrayAction.findMinimum(inputArray);
    assertNotSame(actualValue,expectedValue);
  }

  @DataProvider
  public Object[][] findMaximumData(){
    return new Object[][]{
            {new double[]{1, 3, 4, -12, 4, 6, 8, -4, 0, 3}, 8},
            {new double[]{1,2,3}, 3},
            {new double[]{-5, -78, 0, -99}, 0}
    };
  }
  @Test(dataProvider = "findMaximumData")
  public void findMaximumTest(double[] inputArray, double expectedValue ) {
    double actual = arrayAction.findMaximum(inputArray);
    assertEquals(actual,expectedValue);
  }

  @DataProvider
  public Object[][] replaceItemData(){
    return new Object[][]{
            {new double[]{1, 3, 4, -12, 4, 6, 8, -4, 0, 3}, new double[]{1, 3, 4, 0, 4, 6, 8, 0, 0, 3}},
            {new double[]{1,2,3}, new double[]{1,2,3}},
            {new double[]{-5, -78, 0, -99}, new double[]{0, 0, 0, 0}}
    };
  }
  @Test(dataProvider = "replaceItemData")
  public void replaceItemTest(double[] inputArray, double[] expected) {
    double[] actual = inputArray.clone();
    arrayAction.replaceItem(actual);
    assertEquals(actual, expected);
  }


  @DataProvider
  public Object[][] findAverageData(){
    return new Object[][]{
            {new double[]{1, 3, 4, -12, 4, 6, 8, -4, 0, 3}, 1.0},
            {new double[]{1,2,3}, 2.0},
            {new double[]{-5, -78, 0, -99}, -45}
    };
  }

  @Test(dataProvider = "findAverageData")
  public void findAverageValueTest(double[] inputArray, double expectedValue) {
    double actualValue = arrayAction.findAverage(inputArray);
    assertEquals(actualValue,expectedValue);
  }


  @DataProvider
  public Object[][] findSumData(){
    return new Object[][]{
            {new double[]{1, 3, 4, -12, 4, 6, 8, -4, 0, 3}, 13},
            {new double[]{1,2,3}, 6},
            {new double[]{-5, -78, 0, -99}, -182}
    };
  }
  @Test(dataProvider = "findSumData")
  public void findSumTest(double[] inputArray, double expectedSum) {
    double actual = arrayAction.findSum(inputArray);
    assertEquals(actual,expectedSum);
  }

}