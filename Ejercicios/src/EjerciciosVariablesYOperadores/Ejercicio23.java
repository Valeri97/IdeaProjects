package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
   /*Realiza un programa que pida un número y un porcentaje, y
a. Calcule y muestre ese número incrementado en ese porcentaje.
b. Calcule y muestre ese número decrementado en ese porcentaje.
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        double numero = sc.nextDouble();
        System.out.println("Porcentaje");
        double porcentaje = sc.nextDouble();

        double porcentajeAplicado = numero * (porcentaje / 100);

        double NumIncrementado = numero + porcentajeAplicado;
        System.out.printf("a. El numero incrementado en el porcentaje es: %.2f" , NumIncrementado);

        double NumDecrementado = numero - porcentajeAplicado;
        System.out.printf("b. El numero decrementado en el porcentaje es: %.2f" , NumDecrementado);

    }
}
