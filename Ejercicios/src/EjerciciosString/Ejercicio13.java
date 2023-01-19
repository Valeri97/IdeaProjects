package EjerciciosString;
/**
 Dificultad: media
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
es aquella que se lee igual adelante que atrás.
         */
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        // Se parece al 9 que lo que hace es invertir una cadena.

        //Para poder comparar una cadena al derecho y al revés tenemos que eliminar los espacios
        cadena = cadena.replace(" ","");
        System.out.println(cadena);

        //Se le da la vuelta -> invertimos la cadena.
        String invertida = "";

        // Empezamos en la última posición y vamos recorriendo la cadena hasta llegar a la primera posición (índice 0).
        for (int i = cadena.length() -1 ; i >=0 ; i--) {
            invertida = invertida + cadena.charAt(i);
            System.out.println(invertida);
        }
        if (cadena.equals(invertida)){ //Equuivale a hacer un "==" pero en String
            System.out.println("Es un palíndromo");
        }else{
            System.out.println("No es un palíndromo");
        }

    }
}
