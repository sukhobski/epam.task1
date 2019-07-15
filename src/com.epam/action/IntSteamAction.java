package com.epam.action;

import java.util.stream.IntStream;

public class IntSteamAction {

  public double findAverage(IntStream intStream) {
    return intStream.summaryStatistics().getAverage();
  }

  public double findMin(IntStream intStream) {
    return intStream.summaryStatistics().getMin();
  }

  public double findMax(IntStream intStream) {
    return intStream.summaryStatistics().getMax();
  }

  public int[] sortIntSteam(IntStream intStream) {
    return intStream.sorted().toArray();
  }

  public String summaryStatistics(IntStream intStream) {
    return intStream.summaryStatistics().toString();
  }




}
