package com.epam.task1.action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArraySortTest {

  private ArraySort arraySort =  new ArraySort();

  @DataProvider(name = "data")
  public Object[][] createData(){
    return new Object[][]{
            {new double[]{12, 5, 6, -12, 0, 3.9}, new double[]{-12, 0, 3.9, 5, 6, 12}},
            {new double[]{1, 2, 1, 5, 3}, new double[]{1, 1, 2, 3, 5}},
            {new double[]{0}, new double[]{0}}
    };
  }


  @Test(dataProvider = "data")
  public void bubbleSortTest(double[]array, double[] expected) {
    double[] actual = array.clone();
    arraySort.bubbleSort(actual);
    assertTrue(Arrays.equals(actual,expected));
  }

  @Test(dataProvider = "data")
  public void insertionSortTest(double[]array, double[] expected) {
    double[] actual = array.clone();
    arraySort.insertionSort(actual);
    assertTrue(Arrays.equals(actual,expected));
  }

  @Test(dataProvider = "data")
  public void selectionSortTest(double[]array, double[] expected) {
    double[] actual = array.clone();
    arraySort.selectionSort(actual);
    assertTrue(Arrays.equals(actual,expected));
  }

}