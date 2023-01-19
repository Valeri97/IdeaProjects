package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        programa que muestre los numeros entre 1 y uno introducido por le usuario y que sean divisibles por 2 y 3.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número mayor entero positivo");
        int numero = sc.nextInt();
        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);

            }
        }
    }
}
