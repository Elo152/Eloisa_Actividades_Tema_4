/**
 * Programa que crea un array e introduce la siguiente secuencia de valores:
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez
 * veces, y luego la muestra por pantalla.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        mostrarArray();
    }

    public static void mostrarArray() {
        int i;
        int[] array = new int[11];
        String separador = ",";
        for (i = 0; i < array.length; i++) { // Almacena en el array los números del 1 al 10
            array[i] = i;
            for (int j = 0; j < i; j++) { // Repite el array i veces
                if ((i != array.length) && (j != 9)) {
                    System.out.print(array[i] + separador); 
                } else {
                    System.out.print(array[i]); // No imprime la coma al final
                }
            }
        }
    }
}
