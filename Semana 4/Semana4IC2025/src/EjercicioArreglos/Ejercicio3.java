/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArreglos;

import java.util.Scanner;

/**
 *
 * 
 * Escribe un programa en Java que haga lo siguiente:

Declare un arreglo de double  para 5 calificaciones.
Pida al usuario que ingrese 5 calificaciones y las almacene en el arreglo.
Calcule el promedio de las calificaciones.
 * 
 * 
 * 
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        //Los arrays de tipo primitivo
        double [] notas = new double[5];
        //int [] notasEntero = new int[5];
        //char [] notas = new char[5];
        //boolean [] notas = new boolean[5];
        double suma = 0;
        double promedio = 0;
        
        Scanner ingreso = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
//            double entrada;
            System.out.println("Por favor digite la nota");
//            entrada = ingreso.nextDouble();
//            if (entrada > 0) {
//                 notas[i] = entrada;
//            }else{
//                System.out.println("No se pueden negativos");
//            }
            notas[i] = ingreso.nextDouble();

           
            //suma = suma + entrada;
            suma += notas[i];
            
        }
        
        promedio = suma / notas.length;
        
        System.out.println("El promedio es: "+ promedio);
        
        
    }
    
}
