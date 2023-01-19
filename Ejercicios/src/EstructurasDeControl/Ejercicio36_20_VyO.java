package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio36_20_VyO {
    public static void main(String[] args) {
        /*
        Vuelve a completar los ejercicios que vimos en la UT2, pero utilizando estructuras de
control para mejorarlos. Las mejoras que realizar son las siguientes:
a) Ejercicios 20, 21, 22, 27 hacerlos con for.
b) Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas y el
importe de cada venta.
         */
        /*
        Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
media. Ten en cuenta que la media puede contener decimales.
         */
        Scanner sc = new Scanner(System.in);


        double suma = 0;
        for (int i = 0; i < 4 ; i++) {
            System.out.print("introduce cuatro números: ");
            int num = sc.nextInt();
            suma = suma + num;
        }
            double media = suma / 4;
        System.out.println("La suma de los cuatro números introducidos es: " + suma);
        System.out.println("La media de los cuatro números introducidos es: " + media);
    }
}
