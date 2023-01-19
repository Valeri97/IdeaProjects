package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        /*
        Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO
VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
         */
        Scanner sc = new Scanner(System.in);
        //necesitamos una variable para poder añadir el espacio como caracter
        char c = 0;
        do {
            System.out.println("Introduce un caracter: ");
            c = sc.nextLine().charAt(0);//ponemos nexline en vez de next porque next no llega al espacio en blanco.
            //comprobamos si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println("vocal");
            } else if (c == ' ') {
                break;//si escribimos un espacio en blanco, no queremos que imprima no vocal,sale fuera del if
            } else {
                System.out.println("No vocal");
            }
        }while (c != ' ');//salimos cuando hemos introducido un espacio
    }
}


