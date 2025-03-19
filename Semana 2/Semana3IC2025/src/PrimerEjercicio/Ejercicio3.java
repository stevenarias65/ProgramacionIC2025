
package PrimerEjercicio;

import java.util.Scanner;

public class Ejercicio3 {
    
    
    public static void main(String[] args) {
        
        for (int i = 10; i > 0; i--) {
            
            System.out.println("numero: " + i);
            
        }
        
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite la cantida de alumnos que desea ingresar");
        int cantidad = e.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Este es el estudiante " + i );
        }
        
        
        for (int i = 1; i <= 9; i++) {
            
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+" x " + j + " = " + (i*j));
            }
            System.out.println();
        }
        
    }
    
    
}
