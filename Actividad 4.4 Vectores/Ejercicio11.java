/**
 * Programa que crea dos arrays con 100 números enteros. El primero
 * almacena los números del 1 al 100 y el segundo en sentido inverso
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int i;

        System.out.println("Array 1: ");
        for (i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.print(array1[i] + " | ");
        }

        System.out.println("\n\nArray 2: ");
        for (i = array1.length - 1; i >= 0; i--) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " | ");
        }
    }
}
