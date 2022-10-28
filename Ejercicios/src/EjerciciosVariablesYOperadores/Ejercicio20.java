package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /* Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
media. Ten en cuenta que la media puede contener decimales.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor 1");
        double v1 = sc.nextDouble();

        System.out.println("Valor 2");
        double v2 = sc.nextDouble();

        System.out.println("Valor 3");
        double v3 = sc.nextDouble();

        System.out.println("Valor 4");
        double v4 = sc.nextDouble();

        double suma = v1 + v2 + v3 + v4;
        double media = suma / 4;

        System.out.println("La suma total de todos los valores solicitados es: " + suma);
        System.out.println("La media de los valores es: " + media);
    }
}
