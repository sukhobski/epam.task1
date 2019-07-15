package com.epam.parser;

import java.util.List;

public class Parsers {

  final static String PARSE_LINE = "(\\s*\\-?\\d+\\.?\\d*\\s*)*";

  public void parseListFile(List<String> lines) {
    lines.removeIf(line -> !line.matches(PARSE_LINE) || line.isEmpty());
  }

  public String[] convertListToStringArray(List<String> lines) {
    String[] arrayLinesFromFile = new String[lines.size()];
    for (int i = 0; i < lines.size(); i++) {
      arrayLinesFromFile[i] = lines.get(i);
    }
    return arrayLinesFromFile;
  }

  public double[] convertArrayStringToDouble(String line) {
    String[] strMas = line.split("\\s+");
    double[] doubles = new double[strMas.length];
    for (int i = 0; i < strMas.length; i++) {
      doubles[i] = Double.parseDouble(strMas[i]);
    }
    return doubles;
  }
}