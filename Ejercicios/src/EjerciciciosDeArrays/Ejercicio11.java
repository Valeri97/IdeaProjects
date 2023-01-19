package EjerciciciosDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
indicarlo con un mensaje.
         */
        // Generamos el Array aleatoriamente con número entre 1 y 20 (por ejemplo)
        Scanner sc = new Scanner(System.in);
        int [] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros [i] = (int) (Math.random() * 20 + 1);
        }
        // Lo ordenamos.
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));

        int numero = 0;
        do {
            System.out.println("Introduce un número entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero > 1 || numero > 20){
                System.out.println("El número introducido esta fuera de rango");
            }
        } while (numero < 1 || numero > 20);

        boolean encontrado = false; // Si recorremos el Array y no a cambiado este valor es que no está.

        // Lo buscamos en el Array.
        for (int i = 0; i < enteros.length; i++) {
            if (enteros [i] == numero) {
                System.out.println("El número " + numero + "está en la posición " + (i + 1) + " (índice " + i + "). ");

                // Cambiamos la acción para que no nos imprima luego que no lo hemos encontrado.
                encontrado = true;
                break;
            }
        }
        // Si salimos del for y encontradi sigue como false es que el número no está en el Array.
        if (encontrado == false){
            System.out.println("El número no está en el Array");
        }
    }
}
