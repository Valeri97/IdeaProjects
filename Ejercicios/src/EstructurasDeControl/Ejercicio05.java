package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
de ellos.
         */

        //Vamos a usar dos variables auxiliares: max y min
        // En max vamos a ir guardando temporalmente le número mayor que tengamos.
        // En min vamos a ir guardando temporalmente el número menor que tengamos.

        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1");
        int num1 = sc.nextInt();

        // Al pedir el primer número ese es el mayor y el menor que tenemos de momento
        int max = num1;
        int min = num1;

        System.out.println("Numero 2");
        int num2 = sc.nextInt();

        if (num2 > max){ //Si num2 es mayor que el que teníamos, lo guardamos en max.
            max = num2;
        }

        if (num2 < min) { // Si num 2 es menor que el que teníamos, lo guardamos en min
            min = num2;
        }

        System.out.println("Numero 3");
        int num3 = sc.nextInt();

        if (num3 > max){
        max = num3;
        }

        if (num3 < min) {
        min = num3;
        }

        System.out.println("Numero 4");
        int num4 = sc.nextInt();

        if (num4 > max){
            max = num4;
        }

        if (num4 < min) {
            min = num4;
        }

        System.out.println("Numero 5");
        int num5 = sc.nextInt();

        if (num5 > max){
            max = num5;
        }

        if (num5 < min) {
            min = num5;
        }

        System.out.println("Numero 6");
        int num6 = sc.nextInt();

        if (num6 > max){
            max = num6;
        }

        if (num6 < min) {
            min = num6;
        }

        System.out.println("Numero 7");
        int num7 = sc.nextInt();

        if (num7 > max){
            max = num7;
        }

        if (num7 < min) {
            min = num7;
        }

        System.out.println("Numero 8");
        int num8 = sc.nextInt();

        if (num8 > max){
            max = num8;
        }

        if (num8 < min) {
            min = num8;
        }

        System.out.println("Numero 9");
        int num9 = sc.nextInt();

        if (num9 > max){
            max = num9;
        }

        if (num9 < min) {
            min = num9;
        }

        System.out.println("Numero 10");
        int num10 = sc.nextInt();

        if (num10 > max){
            max = num10;
        }

        if (num10 < min) {
            min = num10;
        }
        System.out.println("El número mayor introducido es: " + max);
        System.out.println("El número menor introducido es: " + min);

    }
}
