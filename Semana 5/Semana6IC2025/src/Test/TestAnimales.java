package Test;

import Ejercicio1.Animales;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAnimales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Si quiero utilizar una clase que se debe de crear?
        //Objetos o instancias
        //Crear un objeto 
        //(tipo de objeto) (nombre objeto) = new Tipo de objeto
//        Animales leon = new Animales();
//        Animales tigre = new Animales("Manolo");
//        Animales perro = new Animales(12,"Mamiferio","Santa");
//        System.out.println("Ingrese el primer nombre");
//        leon.setNombre(entrada.next());
//        System.out.println("Ingrese el segundo nombre");
//        tigre.setNombre(entrada.next());
//
//        leon.setPeso(12);
//        tigre.setPeso(40);
//
//        double peso = leon.getPeso();
//        System.out.println(leon.getPeso());
        ArrayList<Animales> listaAnimales = new ArrayList<>();
        while (true) {
            try {

                System.out.println("Digite la especie");
                String especie = entrada.next();
                System.out.println("Digite el peso");
                double peso = entrada.nextDouble();
                System.out.println("Digite el nombre");
                String nombre = entrada.next();

                Animales n = new Animales(peso, especie, nombre);

                listaAnimales.add(n);

                System.out.println("Desea continuar si / no");
                String opcion = entrada.next();

                if (opcion.equals("no")) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Datos ingresados incorrectos");
            } catch (ArithmeticException e) {
                System.out.println("No se puede divir entre 0");
            } catch (Exception e) {
                System.out.println("Error general, intente de nuevo ");
            }
        }

        for (Animales i : listaAnimales) {
            
            System.out.println("El animal con el nombre "+i.getNombre());
            System.out.println("El animal tiene un peso de: "+i.getPeso());
            System.out.println("El animal tiene una especie de: "+ i.getEspecie());
            System.out.println("------");
            
        }

    }

}
