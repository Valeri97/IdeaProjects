package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio36_21_VyO {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida las notas de las tres evaluaciones del módulo
Programación y muestre la nota final (la nota final es la media de las tres
evaluaciones).
         */
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double nota;
        for (int i = 0; i < 3; i++) {
            System.out.print("introduce las notas de la " + (i + 1) + " evaluación: ");
            nota = sc.nextDouble();
            suma = suma + nota;
        }
       double media = suma / 3;
        System.out.printf("Nota final = %.2f", media);
    }
}
