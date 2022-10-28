package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
    /*
    Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo:
    el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("numero");
        int num = sc.nextInt();
        int prod = num;
        for (int i = 1; i < num; i++){
            prod = prod * i;
        }
        /*
        System.out.println("El factoria de " + num + " es " + prod);

        Scanner sc = new Scanner(System.in);
        System.out.println("numero");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println(num + "! = " + factorial);

         */
    }
}
