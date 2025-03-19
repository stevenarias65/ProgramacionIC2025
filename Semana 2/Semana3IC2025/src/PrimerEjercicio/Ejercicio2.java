package PrimerEjercicio;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /* 
        Ciclos 
        while
        do while
        for en todas sus variantes
         */
        //un acumulador o alguno que me termine el ciclo
        int numero = 1;

        while (numero <= 5) {

            System.out.println("Numero " + numero);

            //numero = numero + 1;
            //numero += 1;
            numero++;

        }

        int numeroa = 5;

        while (numeroa >= 0) {
            System.out.println("numero " + numeroa);
            numeroa--;
        }

        Scanner e = new Scanner(System.in);
        String continuar = "";

        while (true) {

            /*do {
                
            
            System.out.println("desea continuar digite si o no");
            continuar = e.next();

           } while (!continuar.equalsIgnoreCase("si") && !continuar.equalsIgnoreCase("no"));

             */
            System.out.println("desea continuar digite si o no");
            continuar = e.next();
            while (!continuar.equalsIgnoreCase("si") && !continuar.equalsIgnoreCase("no")) {
                System.out.println("Le estoy diciendo que debe de ser si o no, no te voy a dejar pasar");
                System.out.println("digite si o no");
                continuar = e.next();
            }

            if (continuar.equalsIgnoreCase("no")) {
                break;
            }

        }

        int numerow = 100000;

        do {

            System.out.println("Numero: " + numerow);
            numerow++;

        } while (numerow < 5);

    }

}
