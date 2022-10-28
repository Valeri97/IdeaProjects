package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio34 {
    /*
    Escribe un programa que lea tres números y compruebe que todos son diferentes, es
decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1");
        int n1 = sc.nextInt();
        System.out.println("Número 2");
        int n2 = sc.nextInt();
        System.out.println("Número 3");
        int n3 = sc.nextInt();
        boolean igual = !(n1 == n2 || n1==n3 || n2==n3);

        System.out.println("Ninguno de los números son iguales (true): " + igual);

    }
}
