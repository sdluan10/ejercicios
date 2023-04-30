package com.openBootcamp;

public class Ejercicio_7 {

    public static void main(String[] args) {
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("\nDemo de codigo");
    }

    public static void DividePorCero() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int resultado = a / b;
    }
}
