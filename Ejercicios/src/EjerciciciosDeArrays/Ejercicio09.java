package EjerciciciosDeArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Realizar un programa que declare un array y lo vaya llenando de números intoducidos
por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
entra en el array).
         */
        //int [] array = new int [?] --> Como no sabemos cuántos, utilizamos arraylist que es como un chicle.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        int numero = 0;
        do {
            System.out.println("Introduce número (negativo para terminar): ");
            numero = sc.nextInt();
            // Si es negativo, no entra
            if (numero > 0){
                // Si es positivo, lo metemos en el arrayList
                arrayList.add(numero); // Si fuera un array sería array [i] = numero;
            }
        } while (numero >= 0); // Mientras no sea negativo, seguimos
        // Cuando terminamos, imprimimos
        System.out.println(arrayList);
        System.out.println("Ordenado: ");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
