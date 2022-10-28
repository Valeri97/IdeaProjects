package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se
comparan con dos valores guardados previamente. Si coinciden, se indica “Has
entrado al sistema”, en caso contrario se da un error.
         */
        String user = "pablito";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();

        System.out.println("Contraseña: ");
        String contraseña = sc.nextLine();

    }
}
