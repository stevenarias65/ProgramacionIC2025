
package EjercicioLogin;


public class ProfesorLogin extends PersonasLogin{
    
    private String especialidad;
    public ProfesorLogin(String nombre, String apellido, String usuario, String contraseña,String especialidad) {
        super(nombre, apellido, usuario, contraseña);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
