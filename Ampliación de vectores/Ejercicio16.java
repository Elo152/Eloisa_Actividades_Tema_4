/**
 * Programa que crea un array e introduce la siguiente secuencia de valores:
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez
 * veces, y luego la muestra por pantalla.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio16 {
    public static void main(String[] args) {

        int[] array = new int[55];
        int indice = 0;

        for (int i = 0; i <= 10; i++) { // Almacena en el array los números del 1 al 10
            for (int j = 1; j <= i; j++) { // Repite el array i veces
                array[indice] = i;
                indice++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");
    }
}