/**
 * Programa que almacena la nota de 4 alumnos y 5 asignaturas.
 * El usuario introduce las notas, y el programa muestra la nota mínima,
 * máxima y media de cada alumno.
 * 
 * @author Eloisa Martínez
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        float[][] notas = new float[4][5];

        // Almacena las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("\n⬇️ Introduzca las notas del alumno " + (i + 1) + " ⬇️\n");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Asignatura " + (j + 1) + ": ");
                notas[i][j] = Float.parseFloat(System.console().readLine());
            }
        }
        /*
         * Recorre la matriz para identificar la nota mínima, máxima y suma todas las
         * notas
         */
        for (int i = 0; i < notas.length; i++) {
            float minimo = Float.MAX_VALUE;
            float maximo = Float.MIN_VALUE;
            float suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < minimo) {
                    minimo = notas[i][j];
                }
                if (notas[i][j] > maximo) {
                    maximo = notas[i][j];
                }
                suma += notas[i][j];
            }

            float media = suma / notas[i].length;

            System.out.println("\nAlumno " + (i + 1) + ":");
            System.out.println("Nota mínima: " + minimo);
            System.out.println("Nota máxima: " + maximo);
            System.out.println("Nota media: " + media);
        }
    }
}
