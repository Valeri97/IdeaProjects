package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio36_27_VyO {
    public static void main(String[] args) {
        /*
        Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
calificación se compone de los siguientes porcentajes:
a. 55% del promedio de sus tres calificaciones parciales.
b. 30% de la calificación del examen final.
c. 15% de la calificación de un trabajo final.
         */
        Scanner sc = new Scanner(System.in);
        // Calificaciones
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce las calificaciones de la " + (i + 1) + " evaluación: ");
            double nota = sc.nextDouble();
            suma = suma + nota;

        }
        double mediaFinal = suma / 3;
        double media55 = mediaFinal * 0.055;
        System.out.println("introduce la nota del examen final: ");
        double mediaExamen = sc.nextDouble();
        double media30 = mediaExamen * 0.030;
        System.out.println("Introduce la calificación del trabajo final: ");
        double mediaTrabajo = sc.nextDouble();
        double media15 = mediaTrabajo + 0.015;

        double notaFinal= media55 + media30 + media15;

        System.out.printf("La Calificación final de la materia de algoritmos es: %.0f", notaFinal);
    }
}
