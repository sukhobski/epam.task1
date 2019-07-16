package com.epam.action;

import com.epam.printer.ConsolePrinter;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class ArrayActionTest {

  @Test
  public void testBubbleSort() {
    ArrayAction arrayAction = new ArrayAction();
    double[] array = {32.0, 45.0, 56.0, 76.0, 87.0, 88.0, -12.0, 0.0, -7.0, 3.0, 12.0};
    double[] actual = array;
    arrayAction.bubbleSort(array);
    double[] expected = new double[]{32.0, 45.0, 56.0, 76.0, 87.0, 88.0, -12.0, 0.0, -7.0, 3.0, 12.0};
    Arrays.sort(expected);
    Assert.assertEquals(actual,expected);
  }
}