package EjerciciosInternet;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
Puede beber o no
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ques edad tiene");
        int edad = sc.nextInt();
        boolean a = edad >=18;
        System.out.println("Tiene mas de 18 años y puede beber: " + a);
    }
}
