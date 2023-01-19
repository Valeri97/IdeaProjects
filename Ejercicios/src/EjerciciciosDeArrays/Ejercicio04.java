package EjerciciciosDeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
10. Mostrar la suma de todos los números que se guardan en el array.
         */
        //Controla que el número introducido para el tamaño no sea 0 ni negativo con while o do while.
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        do {
            // Si el tamaño que acabo de introducir es negativo o cero, indico el error.
            System.out.println("¿Que longitud debe tener?");
            longitud = sc.nextInt();
            if (longitud <= 0){
                System.out.println("Tamaño incorrecto");
            }
        } while (longitud <= 0);

        int [] numeros = new int [longitud];

        for (int i = 0; i < numeros.length; i++) {
            // numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
            numeros [i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(numeros));
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros [i];
        }
        System.out.println("Suma = " + suma);
    }
}
