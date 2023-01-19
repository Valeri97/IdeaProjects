package EjerciciciosDeArrays;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
la nota más alta que ha sacado y la menor.
         */
        Scanner sc = new Scanner(System.in);
        int [] notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas");
            notas [i] = sc.nextInt();
            do {

            } while (notas [i] >= 0 || notas [i] <=10);
        }
    }
}
