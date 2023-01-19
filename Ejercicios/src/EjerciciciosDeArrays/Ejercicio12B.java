package EjerciciciosDeArrays;

import java.util.ArrayList;

public class Ejercicio12B {
    public static void main(String[] args) {
        /*
        Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.
         */
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();

        // Rellenamos A y B

        for (int i = 0; i < 10; i++) {
            int NumeroA = (int) (Math.random() * 10 + 1);
            A.add(NumeroA);
            int NumeroB = (int) (Math.random() * 10 + 1);
            B.add(NumeroB);
        }
        System.out.println(A);
        System.out.println(B);

        // Rellenamos C.
        for (int i = 0; i < 10; i++) {
            // Añadimos en C lo que tenga en la posición A
            C.add(A.get(i));
            // Añadimos en C lo que tenga en la posición B
            C.add(B.get(i));
        }
        System.out.println(C);
    }
}
