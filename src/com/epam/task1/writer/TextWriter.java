package com.epam.task1.writer;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

  private final String filePath;

  public TextWriter(final String filePath) {
    this.filePath = filePath;
  }

  public void rewriteTextInFile(final String line) throws IOException {
    FileWriter fileWriter = new FileWriter(filePath);
    fileWriter.write(line);
    fileWriter.close();
  }

  public void appendTextInFile(final String line) throws IOException {
    FileWriter fileWriter = new FileWriter(filePath, true);
    fileWriter.write("\n" + line);
    fileWriter.close();
  }

}
