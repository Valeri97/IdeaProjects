package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    /*
    Programa que solicite 2 números, y diga si el primero es múltiplo del segundo (true) si no es false
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1: ");
        int Num1 = sc.nextInt();

        System.out.println("Número 2: ");
        int Num2 = sc.nextInt();
        int division = Num1 % Num2;
        boolean multiplo = division == 0 ;
        System.out.println("El primero número: " + Num1 + " es múltiplo del segundo: " + Num2 + " " + multiplo);
    }
}
