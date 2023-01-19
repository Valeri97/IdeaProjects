package EjerciciosMetodos;

import java.util.Scanner;

public class Ejemplo04CosasDeAves2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String ave = pedirAve();
        imprimirRacion(calcularRacion(pidePeso(ave),pideEdad(ave)), ave);
    }
    // Crear tres métodos:
    // Pide el peso del loro y lo devuelve (No recibe nada)
    public static double pidePeso (String ave){
        System.out.println("Cual es el peso de " + ave + "?");
        double peso = sc.nextDouble();
        return peso;
    }
    // Pide la edad del loro y lo devuelve (No recibe nada)
    public static int pideEdad (String ave){
        System.out.println("Cuántos años tiene el " + ave + "?");
        int años = sc.nextInt();
        return años;
    }
    // Calcula la cantidad de semillas que hay que darle, con esta fórmula: (peso del loro / 5) + edad del loro. Y lo devuelve.
    public static double calcularRacion(double peso, int edad){
        double racion = (peso / 5) + edad;
        return racion;
    }
    // Imprime cuántas semillas tenemos que darle diariamente al loro. (Recibe la cantidad de semillas e imprime el resultado por texto)
    public static void imprimirRacion(double racion, String ave) {
        System.out.println("Teniendo en cuanta el peso y la edad del ave, deberá darle " + racion + " gramos de semillas");
    }
    public static String pedirAve(){
        System.out.println("De que ave se trata?");
        return sc.nextLine();
    }
}
