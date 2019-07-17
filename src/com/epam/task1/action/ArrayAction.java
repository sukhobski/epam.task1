package com.epam.task1.action;

public class ArrayAction {

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

  public double findMinimum(double[] array) {
    double minimumNumber = array[0];
    for (double number :
            array) {
      if (number < minimumNumber) {
        minimumNumber = number;
      }
    }
    return minimumNumber;
  }

  public double findMaximum(double[] array) {
    double maximumNumber = array[0];
    for (double number :
            array) {
      if (number > maximumNumber) {
        maximumNumber = number;
      }
    }
    return maximumNumber;
  }

  public void replaceItem(final double[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = 0;
      }
    }
  }

  public double findAverage(double[] array) {
    int sum = 0;
    for (double number :
            array) {
      sum += number;
    }
    return sum / array.length;
  }

  public double findSum(double[] array) {
    int sum = 0;
    for (double number :
            array) {
      sum += number;
    }
    return sum;
  }

}