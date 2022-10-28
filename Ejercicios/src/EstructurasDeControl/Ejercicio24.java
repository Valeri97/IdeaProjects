package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        int a = sc.nextInt();
        System.out.println("Segundo número: ");
        int b = sc.nextInt();
        int suma = 0;
        for (int i = a; i <= b; i++){
            //Vamos sumando a suma todos los números desde "a" a b.
            suma = suma + i;
        }
        System.out.println("Resultado: " + suma);
    }
}
