package com.openBootcamp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio_5 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("luis");
        array.add("jose");
        array.add("maria");
        array.add("antonio");


        LinkedList<String> enlace = new LinkedList<String>(array);


        System.out.println("ArrayList:");
        for (String elemento : array) {
            System.out.println(elemento);
        }

        System.out.println("\nLinkedList:");
        for (String elemento : enlace) {
            System.out.println(elemento);
        }

    }
}
