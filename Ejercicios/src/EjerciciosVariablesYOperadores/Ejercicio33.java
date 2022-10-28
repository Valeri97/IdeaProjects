package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea tres números enteros e imprima true si el primer
número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe
imprimir false.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1");
        int n1 = sc.nextInt();
        System.out.println("Número 2");
        int n2 = sc.nextInt();
        System.out.println("Número 3");
        int n3 = sc.nextInt();
        boolean t = n1>n2 && n1<n3 || n1<n2 && n1>n3;
        System.out.println(t);

    }
}
