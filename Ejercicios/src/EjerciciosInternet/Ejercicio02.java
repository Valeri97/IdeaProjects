package EjerciciosInternet;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Haz un programa que solicite dos números y diga si son o no iguales
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int num1 = sc.nextInt();
        System.out.println("Introduce el número 2");
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Los dos números son iguales! ");
        } else if (num1 > num2) {
            System.out.println("El número 1: " + num1 + " es mayor que el número 2: " + num2);
        }else{
            System.out.println("El número 2: " + num2 + " es mayor que el número 1: " + num1);
        }
    }
}
