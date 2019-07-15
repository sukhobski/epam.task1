package com.epam.init;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class InitArray {

  public double[] initDoubleArray(int bound, int limit) {
    return DoubleStream.generate(() -> ThreadLocalRandom.current().nextInt(bound)).limit(limit).toArray();
  }

  public double[] initDoubleArray(int size, int minValue, int maxValue) {
    return new Random().doubles(size,minValue,maxValue).toArray();
  }

  public IntStream initIntSteam(int bound, int limit) {
    return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(bound)).limit(limit);
  }

}
