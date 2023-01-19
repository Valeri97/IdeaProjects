package EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio14ConMetodos2 {
    public static void main(String[] args) {
        imprimeResultado(contarPalabras(pedirFrase()));
    }
    // Un método que pida la frase(no reciba nada, devuelve un String)
    public static String pedirFrase (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        return frase;
    }
    // Otro método que calcule las palabras que contiene (recibe un String, devuelve un int)
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
