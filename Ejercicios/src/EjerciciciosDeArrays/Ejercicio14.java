package EjerciciciosDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el
teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás.
         */
        Scanner sc = new Scanner(System.in);
        int [] enteros = new int [10];
        // Lo rellenamos con el método random
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(enteros));
        // Pedimos un número y una posición.
        System.out.println("Número a insertar: ");
        int n = sc.nextInt(); sc.nextLine();

        // Controlamos que la posición que nos dan esté dentro del Array
        int pos = 0;
        do {
            System.out.println("En que posición lo quieres insertar");
            pos = sc.nextInt() - 1;

        } while (pos > enteros.length);
        // Creamos otro array
        int arr2[] = new int[enteros.length];
        // Desplazo todos los que están después de esa posición
        for (int i = 0, j = 0; i < enteros.length; i++) {
            if (pos == i){
                arr2[i] = n;
            } else {
                arr2[i] = enteros [j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
