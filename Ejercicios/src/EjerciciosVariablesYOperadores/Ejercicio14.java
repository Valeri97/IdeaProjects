package EjerciciosVariablesYOperadores;

public class Ejercicio14 {
    public static void main(String[] args) {
        //La formula es 2 * pi * r
        double radio = 3;

        //NEW, el número pi lo podemos poner directamente como Math.PI.

        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);

        //NEW, para mostrar un número de muchos decimales con sólo 2
        System.out.printf("La circunferencia es %.2f", circunferencia);
    }
}
