package com.openBootcamp;

import java.util.Vector;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("luis");
        vector.add("jose");
        vector.add("maria");
        vector.add("antonio");
        vector.add("leovigilda");

        System.out.println(vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);


    }
}
