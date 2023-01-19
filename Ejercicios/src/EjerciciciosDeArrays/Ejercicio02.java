package EjerciciciosDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Haz un programa que lea 5 números decimales por teclado,
los guarde en un array y los muestre en el orden inverso al introducido.
         */
        Scanner sc = new Scanner(System.in);
        double [] numero = new double[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numero [i] = sc.nextDouble();
        }
        for (int i = numero.length -1 ; i >= 0; i--) {
            System.out.println(numero [i] + " ");
        }
    }
}
