package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MOMENTO INICIAL:");
        System.out.println("================");
        System.out.println("introduce la hora: ");
        int hora1 = sc.nextInt();

        System.out.println("introduce los minutos: ");
        int minutos1 = sc.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos1 = sc.nextInt();

        System.out.println("MOMENTO FINAL:");
        System.out.println("================");
        System.out.println("introduce la hora: ");
        int hora2 = sc.nextInt();

        System.out.println("introduce los minutos: ");
        int minutos2 = sc.nextInt();

        System.out.println("Introduce los segundos: ");
        int segundos2 = sc.nextInt();
        System.out.println("Datos introducidos: momento inicial: " + hora1 + ":" + minutos1 + ":" + segundos1 + "\t" + "momento final: " + hora2 + ":" + minutos2 + ":" + segundos2);
        //El truco: es pasar a segundos el momento inicial y el momento final.

        int hora1EnSegundos = hora1 * 60 * 60;
        int minutos1EnSegundos = minutos1 * 60;
        int momentoInicialEnSegundos = hora1EnSegundos + minutos1EnSegundos + segundos1;


        int hora2EnSegundos = hora2 * 60 * 60;
        int minutos2EnSegundos = minutos2 * 60;
        int momentoFinalEnSegundos = hora2EnSegundos + minutos2EnSegundos + segundos2;

        int diferenciaEnSegundos = momentoFinalEnSegundos - momentoInicialEnSegundos;

        int segundosDiferencia = diferenciaEnSegundos % 60;
        int mintotales = diferenciaEnSegundos / 60;
        int horasDiferencia = mintotales /60;
        int minutosDiferencia = mintotales % 60;
        System.out.println("La diferencia entre ambos momentos es: " + horasDiferencia + " : " + minutosDiferencia + " : "  +  segundosDiferencia);
    }
}
