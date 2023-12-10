/**
 * 
 * Programa que realiza calculos con la altura de personas
 * almacenandolas en un array. Luego muestra la altura media
 * la altura máxima, y la mínima. También cuántas personas miden
 * por encima y por debajo de la media
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        double maxima = Double.MIN_VALUE;
        double minima = Double.MAX_VALUE;
        double sumaAlturas = 0;
        int i;

        System.out.print("Introduzca el número de alturas que quiere guardar: ");
        int n = Integer.parseInt(System.console().readLine());
        double[] alturas = new double[n];

        // Almacena las alturas e identifica la altura máxima y mínima
        System.out.println("\nVaya introduciendo las alturas en metros: ");
        for (i = 0; i < alturas.length; i++) {
            alturas[i] = Double.parseDouble(System.console().readLine());
            sumaAlturas = sumaAlturas + alturas[i];
            if (alturas[i] > maxima) {
                maxima = alturas[i];
            }
            if (alturas[i] < minima) {
                minima = alturas[i];
            }
        }

        // Calcula la media y el nº de alturas por encima/debajo de la media
        double media = sumaAlturas / n;
        int contador1 = 0;
        int contador2 = 0;
        for (i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                contador1++;
            } else if (alturas[i] < media) {
                contador2++;
            }
        }

        /*
         * Muestra la media, altura máxima, mínima y nº cuantas personas miden por
         * encima/debajo de la media
         */
        System.out.printf("\nLa media de esas alturas es: %1.2f", media);
        System.out.println("\nLa altura máxima es: " + maxima);
        System.out.println("La altura mínima es: " + minima);
        System.out.println("El número de personas que hay por encima de la media es: " + contador1);
        System.out.println("El número de personas que hay por debajo de la media es: " + contador2);
    }
}
