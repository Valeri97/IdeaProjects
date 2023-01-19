package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        /*
        Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta
que seleccionamos la opción de “Salir”.
         */
        //Opcion 1: Derecha (->) Opcion 2: izquierda (<-), Opcion 3: Subir (^), Opcion 4: bajar(v), Opcion 5: salir
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una opción: 1, 2, 3, 4, 5");
        int opcion = 0;

        //mostramos el menu
        do {
            System.out.println("Menú: \n1. Derecha. \n2. Izquierda. \n3. Arriba. \n4. Abajo. \n5. Salir. ");
            opcion = sc.nextInt();
            //según lo elegido, hacemos una cosa u otra
            switch (opcion) {
                case 1:
                    System.out.println("->");
                    break;
                case 2:
                    System.out.println("<-");
                    break;
                case 3:
                    System.out.println("^");
                    break;
                case 4:
                    System.out.println("v");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        } while (opcion != 5);
        System.out.println("partida terminada");

    }
}
