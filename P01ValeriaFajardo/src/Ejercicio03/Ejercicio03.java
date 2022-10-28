package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Programa que solicite un peso (kg)y altura (m) Y muestre su indice de masa corporal IMC, con dos decimales
        Se calcula IMC = peso/altura^2
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso (en Kg): ");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura (metros): ");
        double altura = sc.nextDouble();

        double masa = peso / (altura * altura);
        System.out.printf("El indice de masa corpotal sería: %.2f", masa);
    }
}
