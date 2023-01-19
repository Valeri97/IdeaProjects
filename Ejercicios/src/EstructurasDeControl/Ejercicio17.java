package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 -
izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o «
mover a la izquierda », o« mover a la derecha », o« no mover », según el número
introducido). Si es un número que no pertenece a ninguna de las direcciones
enumeradas, el programa debería generar: « ¡error! »
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de dirección");
        int numero = sc.nextInt();
        String direccion = "";
        switch (numero){
            case 1:
                direccion = "arriba";
                System.out.println("subir");
                break;
            case 2:
                direccion = "abajo";
                System.out.println("bajar");
                break;
            case 3:
                direccion = "izquierda";
                System.out.println("mover a la izquierda");
                break;
            case 4:
                direccion = "derecha";
                System.out.println("mover a la derecha");
                break;
            case 0:
                direccion = "no mover";
                System.out.println("No mover");
                break;
            default:
                System.out.println("¡error!");
        }
    }
}
