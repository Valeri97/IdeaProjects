package EjerciciosString;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Dime un carácter: ");
        char c = sc.nextLine().charAt(0);

        // Cuánatas veces aparece el carácter?
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            // Si el carácter que miro
            if (cadena.charAt(i) == c) { // Es decir el caracter que esta en la posición (x) de la cadena
                contador++;
            }
        }
        System.out.println("'" + c + "'" + " aparece " + contador + " veces en " + "'" + cadena + "'");
    }
    // Sacar parte del código al método contarCaracter, que recibe un String y un Char
}
