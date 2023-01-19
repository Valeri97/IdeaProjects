package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio38_WHILE {
    /*
    Escribe un programa que solicite al usuario un número entre 1 y 100, ambos
inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un
error y seguir pidiendo el número hasta que se introduzca el número en el rango
indicado. Al terminar debe imprimir por pantalla el número introducido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0; // Lo declaro antes para poder imprimirlo después, fuera del bucle.
        do{
            System.out.print("Número ");
            n1 = sc.nextInt();
            if (n1 < 1 || n1 > 100){
                System.out.println("Error");
            }
        } while (n1 > 100 || n1 < 1); // sigo en el bucle si entroduzco un número fuera del rango
        System.out.println(n1);
    }
}
