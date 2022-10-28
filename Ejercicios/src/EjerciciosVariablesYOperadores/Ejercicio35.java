package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea los números a, b y c y compruebe si existe algún par de
ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o
false).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1");
        int a = sc.nextInt();
        System.out.println("Número 2");
        int b = sc.nextInt();
        System.out.println("Número 3");
        int c = sc.nextInt();
        int suma = a + b;
        int suma2 = a + c;
        int suma3 = b + c;
        boolean veinte = suma == 20 || suma2 == 20 || suma3 == 20;
        System.out.println("Algun par de números suma 20 (true): " + veinte);
    }
}
