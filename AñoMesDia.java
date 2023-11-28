package com.example.unidad2entregar.com.example.Unidad2entregar.com.example.unidad2entregar;

public class AñoMesDia {
    public static void main(String[] args) {

        int años, meses, dias = Integer.parseInt(args[0]);


        System.out.print(dias + "dias"); //Se calcula entero y se dividi entre 360 que son los dias que tiene un año
        años = dias / 365;

        //Se calcula el resto de la division anterior
        dias = dias % 365;

        // De los dias que quedan se calculan los meses que se divide por 30 dias que tiene un mes
        meses = dias / 30;

        //Calculamos el resto de la division anteriror
        dias = dias % 30;

        System.out.println("\tequivalen aproximadamente a"+años+"años, " + meses + "meses y"+ dias + "dias.");


    }
}
