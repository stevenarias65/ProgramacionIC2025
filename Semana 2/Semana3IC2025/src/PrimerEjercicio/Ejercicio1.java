package PrimerEjercicio;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        
        
        int edad = 11;

        if (edad > 18) {
            System.out.println("Es mayor");
        }

        if (edad > 18) {

            System.out.println("Es mayor");

        } else {
            System.out.println("Es menor");
        }

        int nota = 9;

        if (nota >= 0 && nota < 5) {
            System.out.println("insuficiente");
        } else if (nota == 5) {
            System.out.println("suficiente");
        } else if (nota == 6) {
            System.out.println("Es igual a 6");
        } else if (nota == 7) {
            System.out.println("Es igual a 7");
        }

        switch (nota) {
            case 1, 2, 3, 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6, 7:
                System.out.println("bien");
                break;
            case 8:
                System.out.println("debe de mejorar");
                break;
            default:
                System.out.println("la nota no existe");
        }

        //Ternario ? 
        int edadTernario = 20;
        String resultado = edadTernario >= 18 ? "Es mayor de edad" : "es menor de edad";

        System.out.println(resultado);

        int numero = e.nextInt();

        String tipo = (numero > 0) ? "positivo" : (numero < 0) ? "Negativo" : "Cero";

        if (numero > 0) {
            System.out.println("positovo");

        } else {
            if (numero < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("cero");
            }
        }

    }

}
