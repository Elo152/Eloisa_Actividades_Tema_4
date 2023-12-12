/**
 * Programa que crea una matriz de tamaño N x M, e introduce en ella N x M
 * valores. Luego recorre la matriz y muestra cuántos valores son mayores que 0,
 * cuántos menores que 0 y cuántos iguales a 0.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.print("Introduce el tamaño de las filas de la matriz: ");
        int filas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el tamaño de las columnas de la matriz: ");
        int columnas = Integer.parseInt(System.console().readLine());

        int[][] num = new int[filas][columnas];
        int i;
        int j;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        // Introduce los números en la matriz
        System.out.println("Introduce los números de la matriz:");
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                num[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        // Muestra la matriz
        System.out.println("\nLa matriz creada es la siguiente:\n");
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                System.out.printf("| %2d |", num[i][j]);
            }
            System.out.println();
        }

        // Recorre la matriz e identifica si el valor es >,<, o = a 0
        for (i = 0; i < num.length; i++) {
            for (j = 0; j < num[i].length; j++) {
                if (num[i][j] > 0) {
                    mayor++;
                } else if (num[i][j] < 0) {
                    menor++;
                } else if (num[i][j] == 0) {
                    igual++;
                }
            }
        }

        System.out.println("\nEl número de valores mayor a 0 en esta matriz es: " + mayor);
        System.out.println("El número de valores menor a 0 en esta matriz es: " + menor);
        System.out.println("El número de valores igual a 0 en esta matriz es: " + igual);
    }
}