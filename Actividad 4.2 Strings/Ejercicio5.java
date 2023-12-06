/**
 * Programa que lee una frase e indica si la frase es un palíndromo o no.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.print("Introduce una frase todo en mínuscula: ");
        String frase = System.console().readLine().toLowerCase().replaceAll("[^a-z]", "");

        palindromo(frase);
    }

    public static void palindromo(String frase) {

        int inicioFrase = 0;
        int finFrase = frase.length() - 1;

        while (inicioFrase < finFrase) {

            if (frase.charAt(inicioFrase) != (frase.charAt(finFrase))) {
                System.out.println("La frase no es un palíndromo");
                return;
            }

            inicioFrase++;
            finFrase--;
        }

        System.out.println("La frase es un palíndromo");

    }

}
