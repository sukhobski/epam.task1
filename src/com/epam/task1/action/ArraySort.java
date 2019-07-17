package com.epam.task1.action;

import java.util.stream.IntStream;

public class ArraySort {

  public void bubbleSort(double[] array) {
    for (int i = array.length-1; i > 0; i--) {
      for (int j = 0; j < i ; j++) {
        if (array[j] > array[j+1]) {
          double temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;

        }
      }
    }
  }

  public void insertionSort(double[] array) {
    for (int i = 1; i < array.length; i++) {
      double current = array[i];
      int j = i - 1;
      while(j >= 0 && current < array[j]) {
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = current;
    }
  }

  public void selectionSort(double[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      double minimumInteger = array[i];
      int minimumIntegerPosition = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < minimumInteger) {
          minimumInteger = array[j];
          minimumIntegerPosition = j;
        }
      }
      double tempInt = array[i];
      array[i] = minimumInteger;
      array[minimumIntegerPosition] = tempInt;
    }
  }

  public int[] sortIntSteam(IntStream intStream) {
    return intStream.sorted().toArray();
  }

}
