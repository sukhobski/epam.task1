package com.epam.task1.init;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class GenerateArray {

  public double[] generateDoubleArray(int bound, int limit) {
    return DoubleStream.generate(() -> ThreadLocalRandom.current().nextInt(bound)).limit(limit).toArray();
  }

  public double[] generateDoubleArray(int size, int minValue, int maxValue) {
    return new Random().doubles(size, minValue, maxValue).toArray();
  }

  public IntStream generateIntSteam(int bound, int limit) {
    return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(bound)).limit(limit);
  }

}
