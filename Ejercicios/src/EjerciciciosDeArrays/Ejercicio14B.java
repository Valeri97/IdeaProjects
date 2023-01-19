package EjerciciciosDeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14B {
    public static void main(String[] args) {
        /*
        Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el
teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();

        // Lo rellenamos con el método random
        for (int i = 0; i < 10; i++) {
            int numAleatorio = (int) (Math.random() * 10 + 1);
            enteros.add(numAleatorio);
        }
        System.out.println(enteros);
        // Pedimos un número y una posición.
        System.out.println("Número a insertar: ");
        int n = sc.nextInt(); sc.nextLine();

        // Controlamos que la posición que nos dan esté dentro del Array
        int pos = 0;
        do {
            System.out.println("En que posición lo quieres insertar");
            pos = sc.nextInt() - 1;

        } while (pos > enteros.size());
        // Insertamos el número en la posición que nos han dicho
        enteros.add(pos, n);

        // Quitamos el último elemento para que se mantenga con 10 elementos.
        enteros.remove(enteros.size() - 1 );
        System.out.println(enteros);
    }
}
