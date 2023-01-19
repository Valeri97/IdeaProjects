package EjermplosDeClase;

import java.util.Scanner;

public class EjemplosString {
    public static void main(String[] args) {
        String cadena = new String("hola");
        String cadena2 = "hola";

        Scanner sc = new Scanner(System.in);
        String palabra = "esternocleidomastoideo";
        // Podemos a sus caracteres indicando el índice (la posición en la que están.
        System.out.println(palabra.charAt(0)); // es la letra que está en la posición 0 de la palabra
        System.out.println(palabra.charAt(10)); //es la letra que está en la posición 10 de la palabra
        // Para saber la longitud del String se utiliza
        System.out.println("************************************");
        System.out.println("*******  MÉTODOS CON STRING  *******");
        System.out.println("************************************");
        System.out.println("La longitud es: " + palabra.length());
        System.out.println("¿Está vacía? " + palabra.isEmpty());

        String vacia = "";
        System.out.println("¿Está vacía? " + vacia.isEmpty());
        System.out.println("Todo en mayúsculas: " + palabra.toUpperCase());
        System.out.println("Todo en minúsculas: " + palabra.toLowerCase());
        System.out.println("¿Termina con \"cleta\"? " + palabra.endsWith("cleta"));
        System.out.println("¿Termina con \"toideo\"? " + palabra.endsWith("toideo"));
        System.out.println("¿Contiene \"cleido\"? " + palabra.contains("cleido"));
        System.out.println("Subcadena: " + palabra.substring(3, 8)); // posición final le tienes que decir una más de la que quieres
        System.out.println("Sustituye e por i " + palabra.replace("e", "i"));

        String conEspacios = "           tucutucutucutucutucucucucu          ";
        System.out.println("Longitud: " + conEspacios.length() + " String: " + conEspacios);

        String sinEspacios = conEspacios.trim();
        System.out.println("Longitud: " + sinEspacios.length() + " String: " + sinEspacios);

        System.out.println("**                                      **");
        System.out.println("Comparar con equalsIgnoreCase: ");
        String minuscula = "segunda";
        String mayuscula = "SEGUNDA";
        System.out.println("Con equals: " + minuscula.equals(mayuscula));
        System.out.println("Con equalsIgnoreCase: " + minuscula.equalsIgnoreCase(mayuscula));
        System.out.println("************************************");
    }
}
