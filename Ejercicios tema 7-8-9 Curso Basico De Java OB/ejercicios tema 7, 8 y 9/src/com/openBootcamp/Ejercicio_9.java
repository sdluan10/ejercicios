package com.openBootcamp;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar un número secreto al azar entre 1 y 100
        int secretNumber = (int) (Math.random() * 100) + 1;

        // Mapa para guardar los nombres de los jugadores y sus puntuaciones
        Map<String, Integer> scores = new HashMap<>();

        // Lista de los nombres de los jugadores que han jugado
        ArrayList<String> players = new ArrayList<>();

        // Bucle principal del juego
        while (true) {
            // Pedir al usuario que introduzca su nombre
            System.out.println("Introduzca su nombre (o 'salir' para salir del juego):");
            String name = scanner.nextLine();

            // Si el usuario introduce "salir", salir del bucle principal
            if (name.equals("salir")) {
                break;
            }

            // Si el usuario ya ha jugado antes, mostrar su puntuación anterior
            Point nombre = null;
            if (players.contains(nombre)) {
                System.out.println("Bienvenido de nuevo, " + name + ". Tu puntuación anterior fue " + scores.get(name));
            } else {
                System.out.println("Bienvenido, " + name + ".");
            }

            // Puntuación actual del jugador
            int score = 0;

            // Bucle para que el jugador adivine el número secreto
            while (true) {
                // Pedir al usuario que introduzca un número
                System.out.println("Introduzca un número entre 1 y 100:");
                int guess = scanner.nextInt();

                // Incrementar la puntuación del jugador
                score++;

                // Comprobar si el número adivinado es correcto
                if (guess == secretNumber) {
                    System.out.println("¡Correcto! Has adivinado el número secreto en " + score + " intentos.");

                    // Guardar la puntuación del jugador
                    scores.put(name, score);

                    // Añadir el nombre del jugador a la lista de jugadores
                    players.add(name);

                    // Salir del bucle de adivinanza
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("El número secreto es mayor que " + guess + ".");
                } else {
                    System.out.println("El número secreto es menor que " + guess + ".");
                }
            }
        }

        // Mostrar las puntuaciones finales de los jugadores
        System.out.println("Puntuaciones finales:");
        String[] jugador = new String[0];
        for (String player : jugador) {
            System.out.println(player + ": " + scores.get(player));
        }
    }
}
