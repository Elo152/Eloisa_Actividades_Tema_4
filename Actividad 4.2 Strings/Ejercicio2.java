/**
 * Programa que pide dos cadenas de texto e indica si son iguales,
 * sin diferenciar entre mayúsculas y minúsculas
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.print("Introduce una frase: ");
        String frase1 = System.console().readLine();
        System.out.println();
        System.out.print("Introduce una segunda frase: ");
        String frase2 = System.console().readLine();

        // Compara las dos cadenas ignorando las mayúsculas/minúsculas
        boolean compara = frase1.equalsIgnoreCase(frase2);

        if (compara == true) {
            System.out.println();
            System.out.println("Las dos cadenas son iguales.");
        } else if (compara == false) {
            System.out.println();
            System.out.println("Las cadenas no son iguales.");
        }
    }
}
