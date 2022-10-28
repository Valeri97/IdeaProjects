package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        variación mensual ipc = -0.6% y anual 9%.
        Programa que lea el nombre del producto y su precio y calcule su precio teniendo en
        cuenta los datos de variación mensual y anual.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String producto = sc.nextLine();
        System.out.println("Precio del producto: ");
        double precio = sc.nextDouble();
        double porcentaje = precio * -0.006;
        double precioFinal = precio + porcentaje;
        System.out.printf("El precio del producto " + producto + " según la variación mensual es: %.2f ",  precioFinal);

        System.out.println(" ");
        double porcentaje2 = precio * 0.09;
        double precioFinal2 = precio + porcentaje2;
        System.out.printf("El precio del producto " + producto + " según la variación anual es: %.2f ",  precioFinal2);
    }
}
