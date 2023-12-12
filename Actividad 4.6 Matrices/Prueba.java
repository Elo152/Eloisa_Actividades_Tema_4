public class Prueba {
    public static void main(String[] args) {

        System.out.print("Introduzca el número de personas a registrar: ");
        int numeroPersonas = Integer.parseInt(System.console().readLine());

        int[][] sueldos = new int[numeroPersonas][2]; // Columna extra para almacenar género

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
            } else if (genero == 1) {
                sueldosMujer += sueldos[i][0];
                mujeres++;
            }
        }

        float sueldoMedioVaron = varones != 0 ? (float) sueldosVaron / varones : 0;
        float sueldoMedioMujer = mujeres != 0 ? (float) sueldosMujer / mujeres : 0;

        System.out.println("\nMedia sueldos varones: " + sueldoMedioVaron + "€");
        System.out.println("Media sueldos mujeres: " + sueldoMedioMujer + "€");
    }
}