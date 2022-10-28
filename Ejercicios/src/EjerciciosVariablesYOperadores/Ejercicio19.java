package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Si en vez de poner println, se pone solo print se escribe la respuesta del Scanner en la misma línea y no debajo.
        System.out.println("Que valor tiene X1");
        double x1 = sc.nextDouble();
        System.out.println("Que valor tiene y1");
        double y1 = sc.nextDouble();

        System.out.println("Que valor tiene x2");
        double x2 = sc.nextDouble();
        System.out.println("Que valor tiene y2");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        //También se puede hacer con a formula Math.sqrt(Math.pow(x2 - x1), 2) + Math.pow((y2 - xy), 2)
        System.out.println("La distancia entre las variables es: " + distancia);
    }
}
