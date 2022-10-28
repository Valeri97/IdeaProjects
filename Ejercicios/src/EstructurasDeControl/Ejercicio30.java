package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule la suma y el producto de los 30 primeros números
naturales.
         */
        int suma = 0;
        for (int i = 0; i < 30; i++){
            //Este número que pido lo tengo que ir acumulando.
            suma = suma + i;
        }
        System.out.println("La suma de los 30 números es: " + suma);

        int prod = 1;
        for (int i = 1; i <= 30; i++){
            //Este número que pido lo tengo que ir acumulando.
            prod = prod * i;
        }
        System.out.println("El producto de los 30 números es: " + prod);
    }
}
