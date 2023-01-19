package EjerciciciosDeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Ejercicio11B {

    public static void main(String[] args) {
        /*
        Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
indicarlo con un mensaje.
         */
        // Generamos el Array aleatoriamente con número entre 1 y 20 (por ejemplo)
        // Declaramos el array de 10 enteros
        /*
        ArrayList<Integer> enteros = new ArrayList<>();

        // Lo rellenamos de números aleatoriamente dle 1 al 20
        Scanner sc = new Scanner(System.in);


        int [] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros [i] = (int) (Math.random() * 20 + 1);

        }
        // Lo ordenamos.
        Collection.sort(enteros);
        System.out.println(enteros);

        int numero = 0;
        do {
            System.out.println("Introduce un número entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero > 1 || numero > 20){
                System.out.println("El número introducido esta fuera de rango");
            }
        } while (numero < 1 || numero > 20);

        if (enteros.contains(numero)){
            System.out.println("El número está en la posición " + enteros.indexOf(numero) + 1 + "(índice " + enteros.indexOf(numero) + ")");
        } else {
            System.out.println("El número nno está en el ArrayList. ");
        }
         */
    }
}
