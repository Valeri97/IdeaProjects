package EjerciciciosDeArrays;

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Hacer un programa que inicialice una lista de números con valores aleatorios (10
valores), y los muestre ordenados de menor a mayor.
         */
        int [] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random() * 10 + 1);
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
