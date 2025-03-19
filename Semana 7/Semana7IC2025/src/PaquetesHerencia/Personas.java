
package PaquetesHerencia;


public class Personas {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
   

    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Personas(int edad) {
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostraRol(){
        System.out.println("Hola soy una persona");
    }

    
    
}

