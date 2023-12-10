/**
 * 
 * Programa que permite almacenar una secuencia aritmética en un array
 * y mostrarla.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio13 {
    public static void main(String[] args) {

        System.out.print("¿Cuántos números tiene la secuencia?: ");
        int n = Integer.parseInt(System.console().readLine());
        int[] secuencia = new int[n];
        String separador = ",";

        System.out.print("Introduce el valor por el que comenzará la sencuencia: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el valor del incremento: ");
        int incremento = Integer.parseInt(System.console().readLine());
        System.out.println();

        for (int i = 0; i < secuencia.length; i++) {
            secuencia[i] = valor; // Permite empezar la secuencia por el numero introducido
            valor = valor + incremento; // Actualiza el valor, incrementándolo
            if (i != secuencia.length - 1) {
                System.out.print(secuencia[i] + separador);
            } else {
                System.out.print(secuencia[i]); // No imprime la coma al final
            }
        }
    }
}
