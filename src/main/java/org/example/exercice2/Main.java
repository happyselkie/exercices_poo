package org.example.exercice2;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("La Haine", "Mathieu Kassovitz", Date.valueOf("1995-05-31"), "Drame");
        Film film2 = new Film("Avatar 2", "James Cameron",Date.valueOf("2022-12-14"), "Action");

        System.out.println(film1);
        System.out.println(film2);
    }
}
