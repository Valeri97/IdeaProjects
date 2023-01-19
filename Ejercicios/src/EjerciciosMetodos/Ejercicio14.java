package EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio14 {
    /*
    Ejercicio 14. Suponiendo que hemos introducido una cadena por teclado que representa una frase, realiza un programa que cuente las palabras de la frase.
     */
    public static void main(String[] args) {
        String frase = pedirFrase();
        int numeroDePalabras = contarPalabras(frase);
        imprimeResultado(numeroDePalabras);
    }
    public static String pedirFrase (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        return frase;
    }
    public static int contarPalabras(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' '){
                contador++;
            }
        }
        return contador + 1;
    }
    public static void imprimeResultado (int palabras){
        System.out.println("Hay " + (palabras) + " palabras.");
    }
}
