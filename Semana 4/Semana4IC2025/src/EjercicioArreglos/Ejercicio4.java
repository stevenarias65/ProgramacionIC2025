package EjercicioArreglos;

public class Ejercicio4 {

    public static void main(String[] args) {

        int matriz[][] = new int[2][3];

        matriz[0][0] = 3;
        matriz[0][1] = 5;
        matriz[0][2] = 8;

        matriz[1][0] = 6;
        matriz[1][1] = 3;
        matriz[1][2] = 1;

        System.out.println(matriz.length);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println(matriz[i][j]);

            }

        }

    }

}
