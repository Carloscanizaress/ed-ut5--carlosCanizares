package com.example.unidad2entregar.com.example.Unidad2entregar;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        boolean X, Z, Y;
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce valor de X (True o False): ");
        X = leer.nextBoolean();
        System.out.println("Introduce valor de Z (True o False): ");
        Z = leer.nextBoolean();
        System.out.println("Introduce valor de Y (True o False): ");
        Y = leer.nextBoolean();

        System.out.print("X="+X);
        System.out.print("\tZ="+Z);
        System.out.print("\tY="+Y);


        System.out.print("\nOperacion AND: ");
        System.out.println((X && Z) || (X && Y));
        System.out.print("\nOperacion OR: ");
        System.out.println(X || Z && !Y || !X);











    }
}
