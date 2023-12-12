/**
 * Programa que crea una matriz de 5 filas por 5 columnas
 * almacena en ella los números del 1 al 25, y la muestra.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int contador = 1;

        for (int i = 0; i < 5; i++) { // Crea 5 filas
            for (int j = 0; j < 5; j++) { // Crea 5 columnas
                matriz[i][j] = contador; // Genera los números del 1 al 25
                contador++;
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
