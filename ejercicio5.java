package com.example.unidad2entregar.com.example.Unidad2entregar.com.example.unidad2entregar.com.example.Unidad2entregar;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        double Lado, Area, Perimetro;

        Scanner leer = new Scanner(System.in);

        System.out.print("Intruduce el lado: ");
        Lado = leer.nextDouble();

        Area = (Lado * Math.sqrt(3)) / 2;

        System.out.print("Área: ");
        System.out.println((Lado * Area) / 2);

        Perimetro = Lado + Lado + Lado;
        System.out.print("Perimetro: ");
        System.out.println(Perimetro);


    }
}
