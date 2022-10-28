package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
Programa que solicite dias e indique cuantas semanas contiene y cuantos dias sobran
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de días: ");
        int dias = sc.nextInt();
        int semanas = dias / 7;
        int diasSobrantes = dias % 7;
        System.out.println("En " + dias + " días hay " + semanas + " semanas y " + diasSobrantes + " días.");
    }
}
