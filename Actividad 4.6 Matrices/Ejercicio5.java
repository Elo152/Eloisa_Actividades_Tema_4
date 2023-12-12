/**
 * Programa que registra en una matriz los sueldos de hombres y mujeres para
 * detectar si existe brecha salarial. Pide género (0 varón y 1 mujer) y sueldo.
 * Luego muestra el sueldo medio de cada género.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.print("Introduzca el número de personas a registrar: ");
        int numeroPersonas = Integer.parseInt(System.console().readLine());

        int[][] sueldos = new int[numeroPersonas][2];

        int sueldosVaron = 0;
        int varones = 0;
        int sueldosMujer = 0;
        int mujeres = 0;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("\n⬇️ Información persona " + (i + 1) + " ⬇️\n");
            System.out.print("Género (0 varón / 1 mujer): ");
            int genero = Integer.parseInt(System.console().readLine());
            System.out.print("Sueldo: ");
            sueldos[i][0] = Integer.parseInt(System.console().readLine());
            sueldos[i][1] = genero;

            if (genero == 0) {
                sueldosVaron += sueldos[i][0];
                varones++;
            }
            if (genero == 1) {
                sueldosMujer += sueldos[i][0];
                mujeres++;
            }
        }

        if (varones != 0) {
            float sueldoMedioVaron = sueldosVaron / varones;
            System.out.printf("\nMedia sueldos varones: %4.2f €", sueldoMedioVaron);
        } else {
            System.out.println("\nNo hay datos de varones.");
        }
        if (mujeres != 0) {
            float sueldoMedioMujer = sueldosMujer / mujeres;
            System.out.printf("\nMedia sueldos mujeres: %4.2f €", sueldoMedioMujer);
        } else {
            System.out.println("\nNo hay datos de mujeres.");
        }
    }
}
