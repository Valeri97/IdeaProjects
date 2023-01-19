package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
b. false, en caso contrario.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("edad; ");

        int edad = sc.nextInt();
        System.out.print("Nivel de estudios:\n0 - Sin estudios\n1 - Educación primaria\n2 - Eso\n3 - Grado Medio\n4 - Estudios Superiores");
        int estudios = sc.nextInt();
        System.out.print("Ingresos: ");
        int ingresos = sc.nextInt();

        boolean jasp;
            if (edad <= 28 && estudios > 3 || edad < 30 && ingresos > 28000) {
                jasp = true;
            }else {
                jasp = false;
            }
            if (jasp) {
                System.out.println("Eres un Joven Aunque sobradamente Preparado");
        }
    }
}
