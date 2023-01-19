package EjerciciciosDeArrays;

import java.util.Arrays;

public class Ejercicio06 {
    /*
    Realizar un programa en el se se inicialice un array de longitud 20 con números
aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
números positivos,la media de los negativos y contar el número de ceros.
     */
    public static void main(String[] args) {
        int[] Array = new int[20];
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        double sumaPositivos = 0;
        double sumaNegativos = 0;

        for (int i = 0; i < Array.length; i++) {
            // numeros[i] = (int) (Math.random() * (max - min + 1) + (min));
            // Array [i] = (int) (Math.random()) * (10 - (-11) + 1) + (-11));
            Array [i] = (int) (Math.random() * 22 - 11);
            // Números Negativos
            if (Array [i] < 0) {
                contadorNegativos++;
                sumaNegativos = sumaNegativos + Array [i];
            } else if (Array [i] > 0) {
                contadorPositivos++;
                sumaPositivos = sumaPositivos + Array [i];
            }else{
                contadorCeros++;
            }

        }
        // Para hacer la media los contadores son los denominadores.
        double mediaPositivos = sumaPositivos / contadorPositivos;
        double mediaNegativos = sumaNegativos / contadorNegativos;

        System.out.println(Arrays.toString(Array));
        System.out.printf("Hay " + contadorCeros + " ceros en el Array");
        System.out.println("\n");
        System.out.println("Hay " + contadorNegativos + " números negativos en el Array");
        System.out.printf("La media de los números negativos es: %.2f", mediaNegativos);
        System.out.println("\n");
        System.out.println("Hay " + contadorPositivos + " números positivos en el Array");
        System.out.printf("La media de los números positivos es: %.2f", mediaPositivos);
    }
}
