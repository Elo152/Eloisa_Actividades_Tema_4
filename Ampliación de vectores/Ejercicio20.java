/**
 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
 * enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por
 * teclado
 * un valor N y se mostrará por pantalla si N existe en el array, además de
 * cuantas veces.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        int[] array = new int[20];
        int contadorNumero = 0;
        boolean numeroEncontrado = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("\nIntroduzca un número: ");
        int numero = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                numeroEncontrado = true;
                contadorNumero++;
            }
        }

        if (numeroEncontrado) {
            System.out.println("\nEl número " + numero + " está en el array.");
            System.out.println("Aparece: " + contadorNumero + " vez/veces");
        } else {
            System.out.println("\nEl número " + numero + " no está en el array.");
        }
    }
}