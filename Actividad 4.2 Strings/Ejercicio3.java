/**
 * Programa que pide tres cadenas de texto: nombre y dos apellidos. Luego
 * muestra un código de usuario (concatenación de las tres primeras letras de cada cadena)
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.print("Introduzca su nombre: "); 
        String nombre = System.console().readLine();
        System.out.print("Introduzca su primer apellido: ");
        String apellido1 = System.console().readLine();
        System.out.print("Introduzca su segundo apellido: ");
        String apellido2 = System.console().readLine();

        codigo(nombre, apellido1, apellido2);
    }

    public static void codigo (String nombre, String apellido1, String apellido2) {

        // Recoger solo los tres primeros caracteres de cada cadena
        String inicialesNombre = nombre.substring(0,3);
        String inicialesApellido1 = apellido1.substring(0, 3);
        String inicialesApellido2 = apellido2.substring(0, 3); 

        //Imprime los caracteres juntos y en mayúscula
        System.out.println(inicialesNombre.toUpperCase()+inicialesApellido1.toUpperCase()+inicialesApellido2.toUpperCase());
    }
}
