package EjercicioArreglos;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor digite la cantida de usuarios que desea ingresar");
        int cantidad = entrada.nextInt();

        String[] usuarios = new String[cantidad];

        int contador = 0;

        while (contador < usuarios.length) {
            System.out.println("Por favor digite el usuario");
            usuarios[contador] = entrada.next();
            contador += 1;

        }

      

    }

}
