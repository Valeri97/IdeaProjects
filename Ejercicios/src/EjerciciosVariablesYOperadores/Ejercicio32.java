package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean b = x < 10 && x > 0;
        System.out.println(b);
    }
}
