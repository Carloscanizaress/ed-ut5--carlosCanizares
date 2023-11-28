package com.example.unidad2entregar.com.example.Unidad2entregar;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        String A, B, aux;

        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe tu Primer apellido: ");
        A = leer.nextLine();

        System.out.print("Escribe tu Segundo apellido: ");
        B = leer.nextLine();

        aux = A;
        A = B;
        B = aux;

        System.out.println("Los apellidos intercambiados son: "+""+ A +"\t"+ B);




    }


}
