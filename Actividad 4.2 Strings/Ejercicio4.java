/**
 * Programa que muestra cuantas vocales de cada tipo hay en una frase
 * 
 * @author Eloisa Martínez 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.print("Introduce una frase: ");
        String frase = System.console().readLine();

        vocales(frase);
    }

    public static void vocales (String frase) {

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        // Recorre toda la cadena
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a') {
                contadorA++;
            } else if (frase.charAt(i) == 'e') {
                contadorE++;
            } else if (frase.charAt(i) == 'i') {
                contadorI++;
            } else if (frase.charAt(i) == 'o') {
                contadorO++;
            } else if (frase.charAt(i) == 'u') {
                contadorU++;
            }
        }

        System.out.println("Total de A's: " + contadorA);
        System.out.println("Total de E's: " + contadorE);
        System.out.println("Total de I's: " + contadorI);
        System.out.println("Total de O's: " + contadorO);
        System.out.println("Total de U's: " + contadorU);

        }
    }

