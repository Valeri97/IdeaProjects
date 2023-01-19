package EjerciciosInternet;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int num2 = sc.nextInt();

        //Tenemos que determinar cuál es el menos y cuál es el mayor.
        int menor = 0, mayor = 0;
        if (num1 < num2){
            menor = num1;
            mayor = num2;
        }else{
            menor = num2;
            mayor = num1;
        }
        // Tiene que impprimir todos los números desde el menor hasta el mayor.
        for (int i = menor; i <= mayor ; i++) {
            System.out.println(i);
        }
    }
}
