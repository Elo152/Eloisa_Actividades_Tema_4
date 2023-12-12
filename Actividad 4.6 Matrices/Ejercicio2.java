/**
 * Programa que crea una matriz de 10 filas por 10 columnas
 * e introduce los valores de las tablas de multiplicar del 1 al 10.
 * Luego muestra la matriz por pantalla.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];
        int numeroTabla = 1; // Empieza por la tabla del 1
        for (int i = 0; i < matriz.length; i++) { // Genera las filas
            for (int j = 0; j < matriz[i].length; j++) { // Genera las columnas
                matriz[i][j] = numeroTabla * (j + 1); // (j + 1) Multiplica del 1 al 10 el numeroTabla
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
            numeroTabla++; // Incrementa hasta la tabla del 10
        }
    }
}
