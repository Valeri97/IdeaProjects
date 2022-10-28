package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*Calcular el área de un triangulo ( base * altura)/2. Resuelve el ejercicio primero con
variables de tipo entero y después con variables de tipo float.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("La base es: ");
        int base = sc.nextInt();
        System.out.println("La altura es: ");
        int altura = sc.nextInt();
        int area = (base * altura) / 2;
        System.out.println("El área del triangulo es " + area);

        //Forma
        System.out.println("La base  es: ");
        float base2 = sc.nextFloat();
        System.out.println("La altura es: ");
        float altura2 = sc.nextFloat();
        float area2 = (base2 * altura2) / 2f;
        System.out.println("El área del triangulo es " + area2);
    }
}
