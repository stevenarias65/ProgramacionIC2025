/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioLogin;

/**
 *
 * @author steven
 */
public class EstudianteLogin extends PersonasLogin{
    
    private String carrera;
    
    public EstudianteLogin(String nombre, String apellido, String usuario, String contraseña, String carrera) {
        super(nombre, apellido, usuario, contraseña);
        this.carrera = carrera; 
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
