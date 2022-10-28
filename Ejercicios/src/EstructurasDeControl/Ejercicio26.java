package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        Hacer un programa que pida diez números por teclado y calcule su media.
         */
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        for (int i=0; i < 10; i++){
            System.out.println("Número: ");
            double num1 = sc.nextInt();
            //Este número que pido lo tengo que ir acumulando.
            suma = suma + num1;
        }
        double total = suma / 10;
        System.out.println("La media de los diez números es: " + total);
    }
}
