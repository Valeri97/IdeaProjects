package EjerciciciosDeArrays;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) {
        /*
        Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
         */
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;

        // Creamos un Array con los días del mes
        int[] diaMes ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean fechaCorrecta = false;
        do {
            System.out.println("Dia: ");
            dia = sc.nextInt();
            sc.nextLine();

            System.out.println("Mes: ");
            mes = sc.nextInt();
            sc.nextLine();

            // Comprobamos si la fecha es correcta
            if (mes >= 1 && mes <=12 && dia >= 1 && dia <= diaMes[mes - 1]){
                System.out.println("La fecha está correcta");
                // Cambiamos la fecha a correcta para salir del bucle
                fechaCorrecta = true;
            } else {
                System.out.println("La fecha es incorrecta. Vuelva a introducir la fecha");
                fechaCorrecta = false;
            }
        } while (!fechaCorrecta);

        /*
        A continuación, se muestra un mensaje como el siguiente, en el que se indica el mes con letras:
         */

        String [] mesLetra = {"Enero" , "Febrero" ,  "Marzo" ,  "Abril" ,  "Mayo" ,  "Junio" ,  "Julio" ,  "Agosto" ,  "Septiembre" ,  "Octubre" ,  "Noviembre" ,  "Diciembre"};
        System.out.println("Los asientos disponibles para el día " + dia + " de " + mesLetra[mes - 1] + " son: ");
        System.out.println("--------------------------------------------------------------------");

        /*
        Los asientos están representados por un array bidimensional de caracteres, de tamaño 4x4, donde una L indica que el asiento está libre, y una X indica que está ocupado. Inicialmente, algunos asientos están libres y otros ocupados:
         */

        char [][]asientos = new char[4][4];
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }

        // Ponemos algunos ocupados
        asientos[0][1] = 'X';
        asientos[1][1] = 'X';
        asientos[1][2] = 'X';

        // Imprimimos los asientos.
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");

        /*
        Se pide al usuario que indique fila y asiento, controlando que la respuesta esté dentro del rango:
         */

        // Escogemos la fila
        int fila = 0;
        do{
            System.out.println("Elige fila (0 - 4)");
            fila = sc.nextInt();
            if (fila < 0 || fila > 4) {
                System.out.println("Fuera de rango. Por favor, introduce un valor válido entre 0 y 4");
            }
        } while (fila < 0 || fila > 4);

        // Ahora escogemos el asiento
        int asiento = 0;
        do{
            System.out.println("Elige asiento (0 - 4)");
            asiento = sc.nextInt();
            if (asiento < 0 || asiento > 4){
                System.out.println("Fuera de rango. Por favor, introduce un valor válido entre 0 y 4");
            }
        } while (asiento < 0 || asiento > 4);

        /*
        Una vez seleccionados fila y asiento, se comprueba si en esa posición el asiento está ocupado.
         */
        if (asientos[fila][asiento] == 'L'){
            asientos[fila][asiento] = 'X';
            System.out.println("Se te ha asignado el asiento solicitado :)");
            for (int i = 0; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; j++) {
                    System.out.print(asientos[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("El asiento está ocupado. Tendrás que empezar de nuevo");
        }
    }
}
