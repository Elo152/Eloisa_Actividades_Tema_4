/**
 * Programa que crea un array con 100 números reales aleatorios entre
 * 0.0 y 1.0. Luego pide al usuario un valor. Por último muestra cuántos
 * valores del array son iguales o superiores a ese valor.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        double[] numerosAleatorios = new double[100];
        int i;
        int contador = 0;

        // Array que almacena los valores
        for (i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (double) (Math.random());
            System.out.printf("%.1f | ", numerosAleatorios[i]);
        }

        System.out.print("\n\nIntroduzca un valor: ");
        double valor = Double.parseDouble(System.console().readLine());

        System.out.println("\nLos valores del array iguales o superiores a " + valor + " son: \n");

        for (i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] >= valor) {
                contador++;
                System.out.printf("%.1f | ", numerosAleatorios[i]);
            }
        }
        System.out.println("\n\nTotal de valores iguales o superiores a " + valor + ": " + contador);
    }
}