/**
 * Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N
 * que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 * 
 * @author Eloisa Martínez 
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        
        System.out.print("Introduzca un valor: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca otro valor: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        int[] array = new int[valor]; 
        int i; 

        // Almacena en el array los mismo números
        for (i = 0; i < array.length; i++) {
            array[i] = valor2; 
        }

        // Muestra el array
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}