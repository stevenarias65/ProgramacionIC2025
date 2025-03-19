
package EjercicioLogin;

import java.util.ArrayList;


public class LogicaLogin {
    
    private ArrayList<PersonasLogin> usuariosRegistrados ;
    
    public LogicaLogin(){
        usuariosRegistrados = new ArrayList<>();
    }
    
    
    public void registrarUsuario(PersonasLogin persona,String tipo){
        usuariosRegistrados.add(persona);
        System.out.println(tipo+" Ingresado exitosamente");
    }
    
    public boolean inicioSesion(String usuario, String contraseña){
        
        for(PersonasLogin i : usuariosRegistrados ){
            
            if ( i.getUsuario().equalsIgnoreCase(usuario) && i.getContraseña().equals(contraseña) ) {
                
                return true;
                
                
            }
        }
         return false;
    }
    
    
    
    
    
    
    
    
    
    
    
}
