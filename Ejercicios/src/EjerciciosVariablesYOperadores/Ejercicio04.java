package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("El primer número es: ");
        int num1 = sc.nextInt();

        System.out.println("El segundo número es: ");
        int num2 = sc.nextInt();

        System.out.println("El tercer número es: ");
        int num3 = sc.nextInt();

        System.out.println("El cuarto número es: ");
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;

        System.out.println("La suma de " + num1 + " y de " + num2 + " es igual a " + suma);
        System.out.println("El producto de " + num3 + " y de " + num4 + " es igual a " + producto);
    }
}
