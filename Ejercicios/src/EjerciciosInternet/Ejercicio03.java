package EjerciciosInternet;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Realiza un programa que solicite tres números y los pinte en la pantalla ordenados de menor a mayor. Si el usuario introduce el 10, el 20 y el 2, el programa mostrará: “2 10 20”
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int num1 = sc.nextInt();
        System.out.println("Introduce el número 2");
        int num2 = sc.nextInt();
        System.out.println("Introduce el número 3");
        int num3 = sc.nextInt();
        if (num1 > num2 && num2 >num3){
            System.out.println("Los número es orden de menor a mayor es: " + num3 + ", " + num2 + ", " + num1);
        }
    }
}
