package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        /*
        Haz el ejercicio 5 de este mismo tema, pero utilizando un for.
         */
        /*
        Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
de ellos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = sc.nextInt();
        int numMax = num1;
        int numMin= num1;
        int num;
        for (int i = 1; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            num = sc.nextInt();

            if (num > numMax){
                numMax = num;
            }
            if (num < numMin){
                numMin = num;
            }
        }
        System.out.println("El número mayor introducido es: " + numMax);
        System.out.println("El número menor introducido es: " + numMin);
    }
}
