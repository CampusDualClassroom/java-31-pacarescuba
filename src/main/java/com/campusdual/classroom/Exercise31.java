package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"))) {
      String line = "";
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("ERROR: fichero no encontrado.");
      fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("ERROR: fallo al leer lineas del fichero");
      ioe.printStackTrace();
    }
  }
}