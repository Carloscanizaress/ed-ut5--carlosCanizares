package com.example.unidad2entregar;

import java.util.Scanner;

public class Unidad2 {
    public static void main(String[] args) {
        int C1, C2, C3, C4, S, P;

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la calificacion 1: ");
        C1 = leer.nextInt();

        System.out.print("Introduce la calificacion 2: ");
        C2 = leer.nextInt();

        System.out.print("Introduce la calificacion 3: ");
        C3 = leer.nextInt();

        System.out.print("Introduce la calificacion 4: ");
        C4 = leer.nextInt();

        S= C1 + C2 + C3 + C4;
        System.out.print("La suma de todas las calificaciones es: ");
        System.out.println(S);

        P= S / 4;
        System.out.print("La media es: ");
        System.out.println(P);




    }
}
