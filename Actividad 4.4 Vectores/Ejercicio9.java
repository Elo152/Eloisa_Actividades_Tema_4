/**
 * Programa que crea un array de 100 números enteros con valores
 * aleatorios entre 1 y 10. Luego pide un valor N y mostrará en que
 * posición del array aparece N.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        int[] numerosAleatorios = new int[10];
        int[] posiciones = new int[10];
        int contador = 0;
        int i;

        for (i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (1 + Math.random() * 10);
            System.out.print(numerosAleatorios[i] + " | ");
        }

        System.out.print("\n\nIntroduzca un número del array: ");
        int numero = Integer.parseInt(System.console().readLine());
        boolean encontrado = false;

        // Verifica si el numero está en el array
        for (i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] == numero) {
                encontrado = true;
                posiciones[contador] = i;
                contador++;
            }
        }
        // Muestra las posiciones en la que está el número
        if (encontrado) {
            System.out.print("\nEl número " + numero + " está en las siguientes posiciónes: ");
            for (i = 0; i < contador; i++) {
                System.out.print(" [ " + posiciones[i] + " ] ");
            }
        } else {
            System.out.println("\nEl número " + numero + " no se encuentra en nignuna posición del array");
        }
    }
}