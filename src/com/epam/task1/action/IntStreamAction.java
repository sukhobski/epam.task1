package com.epam.task1.action;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamAction {

  IntSummaryStatistics intSummaryStatistics;

  public IntStreamAction(IntStream intStream) {
    intSummaryStatistics = intStream.summaryStatistics();
  }

  public double findAverage() {
    return intSummaryStatistics.getAverage();
  }

  public double findMin() {
    return intSummaryStatistics.getMin();
  }

  public double findMax() {
    return intSummaryStatistics.getMax();
  }

  public String summaryStatistics() {
    return intSummaryStatistics.toString();
  }

}
