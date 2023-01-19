package EjerciciosString;

import java.util.Scanner;

/**
 Dificultad: Fácil
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
la cadena por el segundo carácter.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Dime un caracter: ");
        char c1 = sc.next().charAt(0);
        // También puede ser: String c1 = sc.nextLine().substring(0,1);
        char c2 = sc.next().charAt(0);

        //Sustituimos c1 por c2.
        cadena = cadena.replace (c1 , c2);
        System.out.println(cadena);
    }
}
