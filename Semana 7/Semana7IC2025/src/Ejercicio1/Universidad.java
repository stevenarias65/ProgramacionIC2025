
package Ejercicio1;


public class Universidad {
    String nombre;
    String ubicacion; 
    
    public void ingresarDatos(String nombre){
        this.nombre = nombre;
    }
    public void ingresarDatos(String nombre,String ubicacion){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Universidad " + "nombre = " + nombre + ", ubicacion = " + ubicacion + "";
    }
    
    
    
}
