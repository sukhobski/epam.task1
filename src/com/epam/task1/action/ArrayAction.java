package com.epam.task1.action;

public class ArrayAction {


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