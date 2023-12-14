import java.util.Arrays;
import java.util.Collections;

/**
 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
 * de tipo entero) y luego muestre las puntuaciones en orden descendente
 * (de la más alta a la más baja).
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        System.out.println("Introduzca las puntuaciones de los jugadores: ");
        int numeroJugador = 1;
        int numeroPosicion = 1;

        Integer[] arrayPuntuaciones = new Integer[8];

        for (int i = 0; i < arrayPuntuaciones.length; i++) {
            System.out.print("Puntuación jugador " + numeroJugador + ": ");
            arrayPuntuaciones[i] = Integer.parseInt(System.console().readLine());
            numeroJugador++;
        }

        Arrays.sort(arrayPuntuaciones, Collections.reverseOrder());
        System.out.println("\nRanking de puntuaciones (mayor a menor): ");
        for (int i = 0; i < arrayPuntuaciones.length; i++) {
            System.out.print("\nPuntuacion " + numeroPosicion + ": " + arrayPuntuaciones[i] + " ");
            numeroJugador++;
        }
        System.out.println();
    }
}