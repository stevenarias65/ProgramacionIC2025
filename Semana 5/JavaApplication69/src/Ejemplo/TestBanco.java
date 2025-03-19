
package Ejemplo;

import java.util.Scanner;


public class TestBanco {
    
    
    public static void main(String[] args) {
        
        //Probar nuestra clase
        //para usar una clase debemos de crear un objeto
        //instancia de la clase
        Scanner entrada = new Scanner(System.in);
        
        Personas cliente1 = new Personas("115370036", "ronald", "Arias Fallas", "M", 1231, "CRC", 0);
        
        System.out.println(cliente1.getNombre());
        
       
        
        
     
        
        
       
        
    }
    
    
}
