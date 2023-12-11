/**
 * Programa que crea un array de 10 enteros y luego muestra un menú
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio12Corregido {
    static int[] numerosAleatorios = new int[10];
    static boolean valoresGenerados = false;

    public static void main(String[] args) {
        menu();
    }

    /**
     * Función que imprime el menú y lee las opciones
     */
    public static void menu() {
        char opcion = ' ';
        do {
            System.out.println("\n\nMENÚ");
            System.out.println();
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.println();
            System.out.print("Introduzca la opción: ");
            try {
                opcion = System.console().readLine().charAt(0);
                System.out.println();
                switch (opcion) {
                    case 'a':
                        array();
                        break;
                    case 'b':
                        introducirValor();
                        break;
                    case 'c':
                        System.out.println("Hasta pronto.");
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("\nDato erróneo.");
            }
        } while (opcion != 'c');
    }

    /**
     * Función que almacena datos en el array y los muestra
     */
    public static void array() {
        if (!valoresGenerados) {
            for (int i = 0; i < numerosAleatorios.length; i++) {
                numerosAleatorios[i] = (int) (Math.random() * 11);
                System.out.print(numerosAleatorios[i] + " | ");
            }
            valoresGenerados = true;
        } else {
            for (int i = 0; i < numerosAleatorios.length; i++) {
                System.out.print(numerosAleatorios[i] + " | ");

            }
        }

    }

    /**
     * Función que pide un valor, y una posición.
     * Luego escribe el valor en la posición del array
     */
    public static void introducirValor() {
        try {
            System.out.print("Introduzca un número: ");
            int numero = Integer.parseInt(System.console().readLine());
            System.out.print("Introduzca la posición en la que quiere que aparezca ese número: ");
            int posición = Integer.parseInt(System.console().readLine());
            System.out.println();
            for (int i = 0; i < 10; i++) {
                if (posición == i) {
                    numerosAleatorios[i] = numero;
                }
                System.out.print(numerosAleatorios[i] + " | ");
            }
        } catch (Exception e) {
            System.out.println("\nDato erróneo.");
        }
    }
}
