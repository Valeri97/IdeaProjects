package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número de dos cifras: ");
        int numero = sc.nextInt();

        int decenas = numero / 10;
        int unidades = numero % 10;
        System.out.println(unidades + "" + decenas);
    }
}
