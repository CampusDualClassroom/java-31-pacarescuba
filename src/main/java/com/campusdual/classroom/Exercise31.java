package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

  public static void main(String[] args) {
    File file = new File("src/main/resources/lorem.txt");
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(file);
      br = new BufferedReader(fr);
      String line = "";

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("ERROR: fichero no encontrado.");
      ex.printStackTrace();
    } catch (IOException ex2) {
      System.out.println("ERROR: fallo al leer lineas del fichero");
      ex2.printStackTrace();
    } finally {
      try {
        fr.close();
        br.close();
      } catch (IOException ex3) {
        System.out.println("ERROR: No se ha podido cerrar algún flujo");
        ex3.printStackTrace();
      }
    }
  }
}
