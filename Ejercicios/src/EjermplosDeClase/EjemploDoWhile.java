package EjermplosDeClase;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        // La ventaja que tiene Do While es que siempre se va a ajecutar lo que esta dentro del bloque al menos una vez.
        // Por ejmplo, pedimos números y 0 para salir.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números y 0 para salir:");
        int num = 0;
        do {
             num = sc.nextInt();
         } while (num !=0); // mientras eso no sea false va a seguir pidiendo números8
        System.out.println("Fin :)");
    }
}
