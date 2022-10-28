package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*Escribe un programa que pida dos números e indique si el primero es mayor que el
segundo o no.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1: ");
        int Num1 = sc.nextInt();

        System.out.println("Número 2: ");
        int Num2 = sc.nextInt();
        if (Num1 > Num2) {
            System.out.println("El número 1 es mayor que el número 2");
        } else {
            System.out.println("El número 1 es menor o igual que el número 2");
        }
    }
}
