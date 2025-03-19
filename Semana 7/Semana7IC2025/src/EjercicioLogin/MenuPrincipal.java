package EjercicioLogin;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        //Objeto Scanner para solicitar informacion
        Scanner entrada = new Scanner(System.in);
        
        LogicaLogin logica = new LogicaLogin();
        
        //Variable que almacene la opcion
        int opcion;
   

        do {
            System.out.println("----Menu Principal----");
            System.out.println("1. Registre un Estudiante");
            System.out.println("2. Registre un Profesor");
            System.out.println("3. Inicio de sesion");
            System.out.println("4. Salir");
            System.out.println("Que opcion quiere");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("REGISTRO DE ESTUDIANTE");
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.next();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = entrada.next();
                    System.out.println("Ingrese el usuario: ");
                    String usuario = entrada.next();
                    System.out.println("Ingrese el Contraseña: ");
                    String contraseña = entrada.next();
                    System.out.println("Ingrese la carrera: ");
                    String carrera = entrada.next();

                    EstudianteLogin e = new EstudianteLogin(nombre, apellido, usuario, contraseña, carrera);
                    logica.registrarUsuario(e,"Estudiante");
                    
                    
                    break;
                case 2:
                    System.out.println("REGISTRO DE Profesor");
                    System.out.println("Ingrese el nombre");
                    String nombreP = entrada.next();
                    System.out.println("Ingrese el apellido: ");
                    String apellidoP = entrada.next();
                    System.out.println("Ingrese el usuario: ");
                    String usuarioP = entrada.next();
                    System.out.println("Ingrese el Contraseña: ");
                    String contraseñaP = entrada.next();
                    System.out.println("Ingrese la carrera: ");
                    String carreraP = entrada.next();

                    ProfesorLogin p = new ProfesorLogin(nombreP, apellidoP, usuarioP, contraseñaP, carreraP);
                    logica.registrarUsuario(p,"Profesor");

                    break;
                case 3:
                    
                    System.out.println("---INICIO DE SESION----");
                    System.out.println("Usuario: ");
                    String usuarioLogin = entrada.next();
                    System.out.println("Contraseña: ");
                    String contraseñaLogin = entrada.next();
                    
                    boolean acceso = logica.inicioSesion(usuarioLogin, contraseñaLogin);
                    
                    if (acceso) {
                        System.out.println("Ingreso correcto");
                    }else{
                        System.out.println("Error datos incorrectos");
                    }
                    
                    
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    ;
            }
        } while (opcion != 4);

    }

}
