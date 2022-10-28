package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Leo 5 palabras por teclado
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();
        String palabra4 = sc.nextLine();
        String palabra5 = sc.nextLine();

        //Las escribo cada una en una linea.
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);
        System.out.println(palabra4);
        System.out.println(palabra5);
    }
}
