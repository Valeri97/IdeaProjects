package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
• En caso afirmativo el usuario responderá true
• En caso contrario responderá false.
Si el usuario responde true se le responderá “a la cárcel”. En caso contrario, “¡a casa!”.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Es culpable o no? ");
        boolean culpable = sc.nextBoolean();
        if (culpable == true) {
            System.out.println("¡A la carcel!");
    } else {
            culpable = false;
            System.out.println("¡A casa!");
        }
    }
}
