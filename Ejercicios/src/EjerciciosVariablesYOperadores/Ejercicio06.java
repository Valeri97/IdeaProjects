package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio06 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Número de ardillas: ");
    int ardillas = sc.nextInt();
    System.out.println("Número de nueces: ");
    int nueces = sc.nextInt();

    int cociente = nueces / ardillas;
    int resto = nueces % ardillas;

    System.out.println("A cada ardilla le corresponden " + cociente + " nueces");
    System.out.println("Y sobran " + resto + " nueces");
    }
}
