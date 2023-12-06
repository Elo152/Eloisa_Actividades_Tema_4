/**
 * Programa que pide una frase de texto y muestra cada palabra en una línea
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.print("Introduzca una frase: ");
        String frase = System.console().readLine();

        separarPalabras(frase);
    }

    public static void separarPalabras(String frase) {

       
        System.out.println("Las palabras separadas son:");
        int inicioPalabra = 0;
        int finPalabra;

        while (inicioPalabra < frase.length()) {
            // Encuentra el primer caracter
            while (inicioPalabra < frase.length() && frase.charAt(inicioPalabra) == ' ') {
                inicioPalabra++;
            }

            // Encuentra un espacio en blanco
            finPalabra = inicioPalabra;
            while (finPalabra < frase.length() && frase.charAt(finPalabra) != ' ') {
                finPalabra++;
            }

            // Imprime la palabra encontrada
            if (inicioPalabra < frase.length()) {
                System.out.println(frase.substring(inicioPalabra, finPalabra));
            }

            inicioPalabra = finPalabra + 1;
        }
    }
}