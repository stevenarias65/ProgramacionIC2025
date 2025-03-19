package EjercicioArreglos;

public class Ejercicio6 {

    public static void main(String[] args) {

        int[] numero = {30, 60, 75, 80};
        int numeroBuscado = 80;
        boolean encontrado = false;

        for (int i : numero) {
            if (i == numeroBuscado) {
                encontrado = true;
                break;
            }

        }
        
        
        for (int i = 0; i < 10; i++) {
            if (numero[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }
        
        
        if (encontrado) {
            
            System.out.println("Numero encontrado");
            
            
        }else{
            System.out.println("no lo encontro");
        }
        
        

    }

}
