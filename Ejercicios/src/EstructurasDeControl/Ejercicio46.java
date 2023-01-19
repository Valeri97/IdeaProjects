package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste
adivine un número que el programa ha elegido al azar. El programa debe ir dando
pistas sobre si el número que tiene que adivinar es mayor o es menor que el
introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si
se introduce un número fuera del intervalo debe dar un mensaje de error.
Para que el programa elija un número al azar utilizamos el método random de la
clase Math:

int numAleatorio = (int) (Math.random() * 100 + 1);
         */
        int numAleatorio = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Introduzca un número entre 1 y 100, si se quiere rendir pulsar 0");
            numero = sc.nextInt();
            if (numero < 0 || numero > 100) {
                System.out.println("El " + numero + " esta fuera del rango de 1 a 100");
            } else if (numero == 0) {
                System.out.println("cobarde");
            } else if (numero == numAleatorio) {
                System.out.println("Adivinaste el número!!");
            } else if (numero > numAleatorio) {
                System.out.println("El " + numero + " es mayor del número al azar pensado");
            } else if (numero < numAleatorio) {
                System.out.println("El " + numero + " es menor del número al azar pensado");
            }
        } while (numero != numAleatorio && numero != 0);
    }
}
