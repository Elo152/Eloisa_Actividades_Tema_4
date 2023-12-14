import java.util.Arrays;

/**
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
 * primeros en un array y los 10 últimos en otro array. Por último, comparará
 * ambos arrays y le dirá al usuario si son iguales o no.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int i = 0;

        System.out.println("Introduzca 20 números: ");

        for (i = 0; i < 20; i++) {
            if (i < 10) {
                array1[i] = Integer.parseInt(System.console().readLine());
            } else {
                array2[i - 10] = Integer.parseInt(System.console().readLine());
            }
        }

        if (Arrays.equals(array1, array2)) {
            System.out.println("\nLos arrays son iguales");
        } else {
            System.out.println("\nLos arrays no son iguales");
        }
    }
}
