package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio40 {
/*
Escribe un programa que pida números hasta que se introduzca un cero. Debe
imprimir la suma y la media de todos los números introducidos.
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    // Para ir acumulando la suma, declaramos una variable double (porque es una media con decimales).
    double suma = 0;
    // Para hacer la media necesitamos un contador, que será el denominador de la media.
    int denominador = 0;
    do{
        System.out.print("introduce los números y 0 para salir: ");
        i = sc.nextInt();
        // Sumamos los números que se van a insertar.
        suma = suma + i;
        // Incrementamos el denominador, que va a ser un contador que cuente todos los números que metemos.
        // En el contamos no contamos el 0 que se pone para el cierre.
        if (i != 0) {
            denominador++;
        }
    }while(i != 0);
    System.out.println("Suma = " + suma);
    double media = suma / denominador;
    System.out.println("Media = " + media);
    }
}
