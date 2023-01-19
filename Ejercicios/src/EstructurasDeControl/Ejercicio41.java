package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        /*
        Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el
elemento más grande de la secuencia. El número 0 no está incuido en la secuencia,
sólo se utiliza para finalizar el programa.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Números: ");
        int num = sc.nextInt();
        int numMax = num;
        do {
            System.out.print("Números: ");
            num = sc.nextInt();
            if (num > numMax){
                numMax =num;
            }
        }while (num !=0);
        System.out.println("El número mayor introducido es: " + numMax);
    }
}
