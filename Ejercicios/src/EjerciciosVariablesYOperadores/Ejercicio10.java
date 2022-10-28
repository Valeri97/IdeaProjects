package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de dos dígitos: ");
        int numero = sc.nextInt();
        int decenas = numero /10;
        System.out.println(decenas);
    }
}
