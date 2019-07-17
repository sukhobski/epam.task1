package com.epam.task1.action;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArraySortTest {

  ArraySort arraySort;
  double[] array = {32.0, 45.0, 56.0, 76.0, 87.0, 88.0, -12.0, 0.0, -7.0, 3.0, 12.0};
  double[] expectedArray = new double[]{32.0, 45.0, 56.0, 76.0, 87.0, 88.0, -12.0, 0.0, -7.0, 3.0, 12.0};


  @BeforeClass
  public void setUp() {
    arraySort = new ArraySort();
    Arrays.sort(expectedArray);
  }

  @Test
  public void BubbleSortTest() {
    double[] actualArray = array;
    arraySort.bubbleSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  public void SelectionSortTest() { // класс + Тест
    double[] actualArray = array;
    arraySort.insertionSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

  @Test
  public void insertionSortTest() {
    double[] actualArray = array;
    arraySort.selectionSort(actualArray);
    assertEquals(actualArray, expectedArray);
  }

}