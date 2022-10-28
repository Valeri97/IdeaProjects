package EjermplosDeClase;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {
        //Tipo double
        double ceroComaCero = 0.0;
        double unoComaCero =1.0;
        double decimalNegativo = -5.8968;

        //Tipo Float.
        float decimalFloat = 1.3f;
        float decimalLargoYNeg = -36.4485596875436695445468465435f;
        System.out.println(decimalLargoYNeg);

        //Notación Científica.
        double eps = 5e-3; //es lo mismo que 5 * 10^(-3) = 0.005.
        System.out.println(eps);

        double n = 0.01e2; //Es lo mismo que 0.01 * 10^2 = 1.0
        System.out.println(n);

        //Operaciones aritméticas:
        System.out.println("Suma: " + (eps + n));
        System.out.println("Resta: " + (eps - n));
        System.out.println("Producto: " + (eps * n));
        System.out.println("División: " + (eps / n));

        // ¿Qué pasa si divido números enteros y los guarda en una variable con decimmales?
        double d1 = 5 / 4; // Divide dos números enteros (división entera) y lo asigna a la variable decimal.
        System.out.println("División 1:" + d1);
        double d2 = 5.0 / 4.0; // Divide dos números decimales (división decimal)
        System.out.println("División 2:" + d2);

        //Falta de precisión a veces con las variables primitivas decimales
        System.out.println(3.3 / 3);
        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d);

        // Leer con teclado
        Scanner sc = new Scanner(System.in);
        float decimalPorTeclado = sc.nextFloat(); //Los números decimales por teclado se meten por coma.
        System.out.println(decimalPorTeclado);
        double doublePorTeclado = sc.nextDouble();
        System.out.println(doublePorTeclado);

    }
}
