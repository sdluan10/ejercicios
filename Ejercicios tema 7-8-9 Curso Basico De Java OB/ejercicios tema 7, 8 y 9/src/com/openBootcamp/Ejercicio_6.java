package com.openBootcamp;

import java.util.ArrayList;

public class Ejercicio_6 {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                listaNumeros.add(i);
            }
        }

        System.out.println("ArrayList final:");
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
