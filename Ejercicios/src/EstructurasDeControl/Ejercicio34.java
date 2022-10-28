package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
    /*
    Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de
números a introducir). El programa debe informar de cuantos números introducidos
son mayores que 0, menores que 0 e iguales a 0.
     */
    Scanner sc = new Scanner(System.in);
    // Primero pido cuantos numeros se van a introducir
        System.out.println("Números a introducir");
        int num = sc.nextInt();
        // La variable contador sirve para contar los números que boy metiendo
        int contadorDePositivos = 0;
        int contadorDeNegativos = 0;
        int contadorDeCeros = 0;
        // Ahora los vamos pidiendo
        for (int i = 0; i < num; i++) {
            System.out.println("Introduce número: ");
            int n = sc.nextInt();
            //Cada vez que meto un número el contador se incrementa en una unidad
            if (n > 0){
               contadorDePositivos++;
               System.out.println("Los número positivos que hay son:" + contadorDePositivos);
            } else if (n < 0) {
               contadorDeNegativos++;
               System.out.println("Los número negativos que hay son:" + contadorDeNegativos);
            }else{
               contadorDeCeros++;
               System.out.println("Los número negativos que hay son:" + contadorDeCeros);
            }
        }
        System.out.println("El total de números positivos que hay son:" + contadorDePositivos);
        System.out.println("El total de números negativos que hay son:" + contadorDeNegativos);
        System.out.println("El total de ceros que hay son:" + contadorDeCeros);

    }
}
