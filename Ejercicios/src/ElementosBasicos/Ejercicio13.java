package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //programa para escribir por teclado
        Scanner sc = new Scanner(System.in);
        //Pongo la pregunta a responder
        System.out.println("¿Como te llamas?");
        //ejecuto para que pueda poner la respuesta.
        String nombre = sc.nextLine();
        //Después se podría poner una respuesta a la respuesta con "sout"

        System.out.println("¿Que edad tienes?");
        int edad = sc.nextInt();

        System.out.println("¿Cuántos años de experiencia tienes?");
        int experiencia = sc.nextInt();

        sc.nextLine();
        System.out.println("¿Cuál es la preferencia en cocina?");
        String preferenciaCocina = sc.nextLine();

        //Pongo un comentario con todos los datos dados

        System.out.println("El formulario de " + nombre + ", de " + edad + " años y de " + experiencia + " de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida vegetariana" );
    }
}
