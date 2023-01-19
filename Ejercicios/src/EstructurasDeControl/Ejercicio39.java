package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        /*
        39. Escribe un programa que cuente la cantidad de números que vamos introduciendo
por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la
secuencia (sin contar el 0 final).
         */
        Scanner sc = new Scanner(System.in);
        // Vamos a ir introduciendo hasta que pongamos un "0".
        // Usamos un do while porque al menos un número tenemos que meter.

        int n = 0; //Esta variable es para guardar el número que cada vez introducimos por teclado.
        // Para contar los números declaramos una variable contador, que comienza con 0.
        int contador = 0;
        do {
            // Leo el número.
            n = sc.nextInt();
            contador++;
        } while (n != 0); // Mientras el número introducido no sea 0, seguimos en el bucle.
        // Al finalizar mostramos la longitud de la secuencia, osea cuantos números hemos metido, el contador.
        contador = contador - 1; // Se le quita un número para eliminar el 0 que añadimos al final para poder cerrar.
        System.out.println("Has añadido " + contador + " números");
    }
}
