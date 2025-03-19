
package EjercicioArreglos;

import java.util.Arrays;

public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        
        
        //Arreglo como crearlo
        //Tipo dato nombre
        int numeros[];
        String[] nombres;
        
        numeros = new int[5];
        nombres = new String[3];
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        String colores[] = new String[5];
        
        colores[0] = "amarillo";
        colores[1] = "Rojo";
        colores[2] = "Azul";
        colores[3] = "Verde";
        colores[4] = "Anaranjado";
        
        
        System.out.println(colores.length);
        System.out.println(Arrays.toString(colores));
        
        
        //recorrer un arreglo
        for (int i = 0; i < colores.length; i++) {
            System.out.println(colores[i]);
        }
        
        for (String i : colores){
            System.out.println(i);
        }
        
        for (int j : numeros ){
            System.out.println("Hola");
        }
        
        //for (Tipodato nombreVariable : coleccion )
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+10);
        }
        
        
        
            
        
    }
    
    
}
