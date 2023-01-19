package EjerciciosString;

import java.util.Scanner;

/**
 Dificultad: Dificil
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
minúsculas y viceversa.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena: ");
        String cadena = sc.nextLine();
        String cambiada ="";
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))){
                cambiada = cambiada + Character.toUpperCase(cadena.charAt(i));
            }else{
                cambiada = cambiada + Character.toLowerCase(cadena.charAt(i));
            }
        }
        System.out.println(cambiada);
    }
}
