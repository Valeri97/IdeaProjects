package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        /*
        Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,
siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,
para n = 5:
*****
****
***
*
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el número de lados: ");
        int n = sc.nextInt();
        if (n > 0){
            System.out.println("introduce el caracter: ");
            char c = sc.next().charAt(0);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                System.out.print(c);
                }
                System.out.println(" ");
            }
        }else{
            System.out.println("El número no puede ser negativo ni cero");
        }
    }
}
