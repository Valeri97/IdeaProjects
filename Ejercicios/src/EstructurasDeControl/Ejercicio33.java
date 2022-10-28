package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        Escribe un programa que, dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el
método Math.pow().
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("numero 1");
        int base = sc.nextInt();

        System.out.println("numero 2");
        int exp = sc.nextInt();
        int base2 = base;
        for ( int i = base; exp < 1; i++){
            base = base * i;
        }
        System.out.println(base);
    }
}
