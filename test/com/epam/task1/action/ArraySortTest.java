package com.epam.task1.action;

import com.epam.task1.init.GenerateArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ArraySortTest {

  ArraySort arraySort =  new ArraySort();;
  GenerateArray generateArray = new GenerateArray();;
  double[] array;
  double[] expectedArray;

  @BeforeClass
  public void setUp() {
    array = generateArray.generateDoubleArray(100,-1000,1000);
    expectedArray = new double[array.length];
    expectedArray = array.clone();
    Arrays.sort(expectedArray);
  }

  @Test
  public void BubbleSortTest() {
    double[] actualArray = array.clone();
    arraySort.bubbleSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  public void SelectionSortTest() {
    double[] actualArray = array.clone();
    arraySort.insertionSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  public void insertionSortTest() {
    double[] actualArray = array.clone();
    arraySort.selectionSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

}