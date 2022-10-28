package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    /*Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
    cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
    minutos*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cantidad de minutos: ");
        int minutos = sc.nextInt();
        //Calculamos cuantas horas y minutos corresponden a los minutos introducidos.
        int horas = minutos / 60;
        int minutos2 = minutos % 60;
        System.out.println(minutos + " minutos equivalen a " + horas + " horas/s y " + minutos2 + " minutos.");
    }
}
