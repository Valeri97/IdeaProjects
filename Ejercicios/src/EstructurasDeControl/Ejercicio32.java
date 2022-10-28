package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n
        un número introducido por el usuario.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;  i <= n ; i++){
            if ( i % 5 == 0 ){
                System.out.print(" el número es múltiplo de 5 " + i + ", ");
        }
        }
        }
    }
