package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /* Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
del lado por cuatro).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuaánto es el lado del cuadrado?: ");
        double lado = sc.nextDouble();

        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado cuyo lado es " + lado + " es  " + perimetro);
    }
}
