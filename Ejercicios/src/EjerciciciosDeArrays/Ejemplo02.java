package EjerciciciosDeArrays;

import java.util.Arrays;

public class Ejemplo02 {
    public static void main(String[] args) {
        /*
        Hacer un programa que inicialice una lista de números con valores aleatorios (10
valores), y los muestre ordenados de menor a mayor.
Números entre -5 y 5
         */
        int [] lista = new int [10];
        // Lo rellenamos con números entre -5 y 5.
        for (int i = 0; i < lista.length; i++) {
            lista [i] = (int) (Math.random() * 12 -6);
        }
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
