package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    //Ejercicio de Decrecimiento
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        n3 -= 1;    //porque esto así no se puede poner dentro del sout
        n4--;   //No lo pongo dentro de sout porque me imprimiría primeroantes de incrementarse
        System.out.println((n1 - 1) + " " + --n2 + " " + n3 + " " + n4--);
    }
}
