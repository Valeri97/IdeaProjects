package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio36_22_VyO {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida las notas finales de todos los módulos de 1o y muestre
la nota final del curso. La nota final es la media de las notas de todos los módulos,
redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si
es 7,4, la nota final es 7).
         */
        Scanner sc = new Scanner(System.in);
        //Módulos
        double suma = 0;
        double notas = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Notas del módulo " + (i + 1) + ": ");
             notas = sc.nextDouble();
            suma = suma + notas;
        }
        double media = suma / 6;
        System.out.printf("La media de los seis módulos es: %.0f",  media);
    }
}
