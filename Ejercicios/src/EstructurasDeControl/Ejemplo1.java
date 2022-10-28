package EstructurasDeControl;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        if (edad > 100) {
            System.out.println("Eres una persona con mucha experiencia");

         */
            //El resultado de la condición boolean;

           /* boolean SemaforoAbierto = false;
            if (SemaforoAbierto) {
                System.out.println("Adelante, puedes pasar.");
            }else{
                System.out.println("Detente, pecador");

            */
        //Vamos a ver si un número es par o impar

        /* System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
             */
            int presupuesto = sc.nextInt();
            if (presupuesto < 100) {
                System.out.println("Esto no es para mi");
            }else if (presupuesto >= 100 && presupuesto < 200) {
                System.out.println("Me comprare el paquete básico");
            }else if (presupuesto >= 200 && presupuesto < 300) {
                System.out.println("Me compraré el paquete estándar.");
            }else{
                System.out.println("Me compro lo que quiera.");
            }
        }
    }
