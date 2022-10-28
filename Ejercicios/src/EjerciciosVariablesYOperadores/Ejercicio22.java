package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*Realiza un programa que pida las notas finales de todos los módulos de 1o y muestre
la nota final del curso. La nota final es la media de las notas de todos los módulos,
redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si
es 7,4, la nota final es 7).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota de Programación");
        double Nota1 = sc.nextDouble();

        System.out.println("Nota de Entornos");
        double Nota2 = sc.nextDouble();

        System.out.println("Nota de Lenguajes");
        double Nota3 = sc.nextDouble();

        double fincurso = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println(fincurso);
        System.out.printf("La nota de Fin de curso es %.0f", fincurso);
    }
}
