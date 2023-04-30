package com.openBootcamp;

import java.io.*;

public class Ejercicio_8 {

    public static void copy(String fileIn, String fileOut) {
        try {
            InputStream inputStream = new FileInputStream(fileIn);
            PrintStream outputStream = new PrintStream(new FileOutputStream(fileOut));

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileIn = "archivoEntrada.txt";
        String fileOut = "archivoSalida.txt";
        copy(fileIn, fileOut);
    }

}
