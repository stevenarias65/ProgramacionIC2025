/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import PaquetesHerencia.Personas;

/**
 *
 * @author steven
 */
public class Estudiantes extends Personas{
    
    private String curso;

    public Estudiantes(String nombre, String apellido, 
            String curso) {
        super(nombre, apellido);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setCurso(String curso,String año) {
        this.curso = curso;
    }
    
    @Override
    public void mostraRol(){
        System.out.println("Hoy soy del rol Estudiante");
    }
    
    
    
    
}
