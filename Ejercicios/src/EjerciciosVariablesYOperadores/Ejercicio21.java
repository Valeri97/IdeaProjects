package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*Realiza un programa que pida las notas de las tres evaluaciones del módulo
Programación y muestre la nota final (la nota final es la media de las tres
evaluaciones).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota de la primera evaluación");
        double Ev1 = sc.nextDouble();

        System.out.println("Nota de la segunda evaluación");
        double Ev2 = sc.nextDouble();

        System.out.println("Nota de la tercera evaluación");
        double Ev3 = sc.nextDouble();

        double suma = Ev1 + Ev2 + Ev3;
        double media = suma / 3;
        System.out.printf("La nota final de programación es: %.2f",media);
    }
}
