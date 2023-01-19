package EjermplosDeClase;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploContadores {
    public static void main(String[] args) {
        // Crear un programa que pida 10 letras por teclado, las vaya guardando en un Array de carácteres

        Scanner sc = new Scanner(System.in);
        char [] caracteres = new char[10];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres [i] = sc.next().charAt(0); // Guarda en la posición del índice i, el caracter que introducimos por teclado,
        }
        System.out.println(Arrays.toString(caracteres));
        /*
        Quiero imprimir el valor que tengo guardado en el índice 5
        System.out.println(caracteres[5]);
         */

        // Pide un carácter y al final muestra cuantas veces aparece ese carácter.
        System.out.println("¿Qué carácter quieres que cuente?: ");
        char c = sc.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == c){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
