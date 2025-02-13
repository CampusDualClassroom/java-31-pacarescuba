package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"))) {
      String line = "";
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException ioe) {
      throw new RuntimeException(ioe);
    }
  }
}