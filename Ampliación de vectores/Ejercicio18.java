import java.util.Arrays;

/**
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
 * aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores
 * del array y los mostrará por pantalla.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio18 {
    public static void main(String[] args) {

        int[] array = new int[30];

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array); // Ordena el array

        System.out.println("\n\nArray ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
