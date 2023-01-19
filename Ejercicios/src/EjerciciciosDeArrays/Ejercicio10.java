package EjerciciciosDeArrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
simplificarlo vamos a suponer que febrero tiene 28 días.
         */
        Scanner sc = new Scanner(System.in);

        int mes = 0;
        // Vamos a controlar que se introduzcan número validos.
        do {
            System.out.println("Di un número del mes (1 - 12): ");
            mes = sc.nextInt();
        } while (mes < 0 || mes > 12); // Si falla seguimos preguntando

        // Array de meses con letras
        String [] nombreMes ={"Enero", "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre", "Diciembre"};
        // Otro array de meses con los días de cada mez
        int [] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Los dos Arrays van correlativos: el mismo índice indica nombre y días que tiene el mes.
        // Si meto un 4 --> Abril tiene 30 días. Pero ojo, el índice del mes 4 es 3 porque 0-1-2-3...
        System.out.println(nombreMes[mes - 1] + " tiene " + diasMes[mes - 1] + " días. ");
    }
}
