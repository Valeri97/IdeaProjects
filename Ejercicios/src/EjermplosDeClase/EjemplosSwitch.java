package EjermplosDeClase;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una acción (1-4)");
        int accion = sc.nextInt();
        /*
        if (accion == 1) {
            System.out.println("Comenzando partida.");
        } else if (accion == 2) {
            System.out.println("Cargando partida guardada");
        } else if (accion == 3) {
            System.out.println("Mostrar ayuda");
        } else if (accion == 4) {
            System.out.println("Salir");
        }else {
            System.out.println("Acción incorrecta");
        }
        */
        // Esto se puede poner de otra forma
        // Cuando en el if tienes == o equals --> evalúas el valor de una variable y según sea haces una acción u otra.

        /*
        switch (accion) { //en ese () sólo puede ir el nombre de la variable
            case 1:
                System.out.println("Comenzando partida.");
                break;
            case 2:
                System.out.println("Cargando partida guardada");
                break;
            case 3:
                System.out.println("Mostrar ayuda");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default: //aqui entra si no se cumple ninguno de los casos anteriores
                System.out.println("Acción incorrecta");
                break;
        }
        System.out.println("Fin");

         */
        sc.nextLine();
        System.out.println("Dia de la semana");
        String dia = sc.nextLine();
        //Según el día que sea quiero que me ponga un número
        int numero = 0;
        switch (dia) {
            case "Lunes":
                numero = 1;
                break;
            case "Martes":
                numero = 2;
                break;
            case "Miercoles":
                numero = 3;
                break;
            case "Jueves":
                numero = 4;
                break;
            case "Viernes":
                numero = 5;
                break;
            case "Sábado":
                numero = 6;
                break;
            case "Domingo":
                numero = 7;
                break;
            default:
                System.out.println("Lo que has introducido no es un día de la semana.");
        }
        System.out.println(numero);
    }
}
