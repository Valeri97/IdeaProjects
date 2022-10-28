package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos1 = sc.nextInt();
        //Cálculo de los minutos y segundos restantes.
        int minutos = segundos1 /60;
        int segundos = segundos1 % 60;
        //Cálculo de las horas, minutos y segundos.

        int horas = minutos / 60;
        int minutosRest = minutos % 60;

        System.out.println(segundos1 + " contiene " + horas + " horas " + minutosRest + " minutos " + segundos + " segundos. ");
    }
}
