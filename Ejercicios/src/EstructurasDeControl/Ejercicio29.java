package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        /*
        Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de
multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas
puedes usar el tabulador \t). Ejemplo:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número entero, positivo: ");
        int numero = sc.nextInt();
        int multiplicacion = 1;
        if (numero > 0){
            for (int i = 0; i < numero; i++) {
                System.out.println("tabla del " + (i + 1) + " = ");
                multiplicacion = multiplicacion * i;
                System.out.println(numero);
                for (int j = 0; j < 10; j++) {

                }
            }
        }else{
            System.out.println("El númer0 está fuera del rango");
        }
    }
}
