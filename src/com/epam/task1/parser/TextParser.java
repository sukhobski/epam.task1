package com.epam.task1.parser;

import java.util.List;

public class TextParser {

  private final static String PARSE_REGEX_ARRAY_DOUBLE = "(\\s*\\-?\\d+\\.?\\d*\\s*)*";

  private final static String SPLIT_REGEX = "\\s+";

  public boolean isLineValid(String line) {
    return  line.matches(PARSE_REGEX_ARRAY_DOUBLE) && !line.isEmpty();
  }

  public void removeIncorrectLines(List<String> lines) {
    lines.removeIf(line -> !isLineValid(line));
  }

  public String[] convertListToStringArray(List<String> lines) {
    return (String[]) lines.toArray();
  }

  public double[] convertArrayStringToDouble(String line) {
    String[] strMas = line.split(SPLIT_REGEX);
    double[] doubles = new double[strMas.length];
    for (int i = 0; i < strMas.length; i++) {
      doubles[i] = Double.parseDouble(strMas[i]);
    }
    return doubles;
  }

}