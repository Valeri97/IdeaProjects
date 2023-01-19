package EjerciciosMetodos;

import java.util.Scanner;

public class Ejemplo02DeLoros {
    // Mejor con un Scanner estático
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double peso = pidePeso();

        int años = pideEdad();

        double racion1 = calcularRacion(peso,años);
        imprimirRacion(racion1);
    }
    // Crear tres métodos:
        // Pide el peso del loro y lo devuelve (No recibe nada)
    public static double pidePeso (){
        System.out.println("Cual es el peso del Loro");
        double peso = sc.nextDouble();
        return peso;
    }
        // Pide la edad del loro y lo devuelve (No recibe nada)
        public static int pideEdad (){
            System.out.println("Cuántos años tiene el Loro");
            int años = sc.nextInt();
            return años;
        }
        public static double calcularRacion(double peso, int edad){
            double racion = (peso / 5) + edad;
            return racion;
        }
        // Imprime cuántas semillas tenemos que darle diariamente al loro. (Recibe la cantidad de semillas e imprime el resultado por texto)
        public static void imprimirRacion(double racion) {
            System.out.println("Teniendo en cuanta el peso y la edad del ave, deberá darle " + racion + " gramos de semillas");
        }
        // Calcula la cantidad de semillas que hay que darle, con esta fórmula: (peso del loro / 5) + edad del loro. Y lo devuelve.
        // Imprime cuántas semillas tenemos que darle diariamente al loro. (Recibe la cantidad de semillas e imprime el resultado por texto)
}
