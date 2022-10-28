package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida tres números y los muestre ordenados (de mayor a
menor);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("N1: ");
        int n1 = sc.nextInt();
        System.out.println("N2: ");
        int n2 = sc.nextInt();
        System.out.println("N3: ");
        int n3 = sc.nextInt();
        //n1, n2, n3
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);

            //n1, n3, n2
        }else if (n1 > n3 && n3 > n2){
            System.out.println(n1 + " " + n3 + " " + n2);

            //n2, n1, n3
        }else if (n2 > n1 && n1 > n3){
            System.out.println(n2 + " " + n1 + " " + n3);

            //n2, n3, n1
        }else if (n2 > n3 && n3 > n1){
            System.out.println(n2 + " " + n3 + " " + n1);

            //n3, n1, n2
        }else if (n3 > n1 && n1 > n2){
            System.out.println(n3 + " " + n1 + " " + n2);

            //n3, n2, n1
        }else{
            System.out.println(n3 + " " + n2 + " " + n1);
        }
    }
}
