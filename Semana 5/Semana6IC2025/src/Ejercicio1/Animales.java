package Ejercicio1;

//Nombre
public class Animales {
    //Encapsulamiento
    //private public protected default

    //Atributos (propiedades)
    private double peso;
    String especie;
    private String nombre;
    private boolean estadoComida = false;

    //Constructor Sobrecarga
    public Animales(double peso, String especie, String nombre) {
        this.peso = peso;
        this.especie = especie;
        this.nombre = nombre;
        System.out.println("estoy en el constrcutor que pide las 3");
    }

    public Animales(double peso, String especie) {
        this.peso = peso;
        this.especie = especie;
        System.out.println("Estoy en el constrcutor que pide peso y especie");
    }

    public Animales(String nombre) {
        System.out.println("Estoy en el construtor que solo pide String ");
        this.nombre = nombre;
    }

    public Animales() {
        System.out.println("Estoy en el constrcutor vacio");
    }

    //metodos
    //Contruccion 
    //Encapsulamento   tipo de metodo(String,Double,int,boolean,void) nombre al metodo (parametros son opcionales)
    public void setPeso(double peso) {
        this.peso = peso;
        System.out.println("Peso agregado para " + nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre Agregado");
    }

    public void setEspecie(String especie) {
        this.especie = especie;
        System.out.println("Especie agregada");
    }

    public void setEspecie(String especie, int altura) {

    }

    public double getPeso() {
        return this.peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void comer() {
        estadoComida = true;
    }

}
