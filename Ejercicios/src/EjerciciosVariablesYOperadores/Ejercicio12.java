package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int centenas =num /100;
        int resto1 = num % 100;

        int decenas = resto1 / 10;
        int unidades = resto1 % 10;
        System.out.println(unidades + "" + decenas + "" + centenas);
    }
}
