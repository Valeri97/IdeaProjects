package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*
        Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el
segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos
los números enteros desde el menor hasta el mayor, ambos inclusive.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        int a = sc.nextInt();
        System.out.println("Segundo número: ");
        int b = sc.nextInt();
        int suma = 0;
        if (a < b){
            for (int i = a; i <= b; i++){
                //Vamos sumando a suma todos los números desde "a" a b.
                suma = suma + i;
            }
            System.out.println("Resultado: " + suma);
        }else{
            for (int i = b; i <= a ; i++){
                suma = suma + i;
        }
            System.out.println("Resultado: " + suma);
        }
// Otra forma de hacerlo es:
        /*

        int suma = 0;
        int mayor, menor;
        if (a < b){
            menor = a;
            mayor = b;

        }else{
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <= mayor; i++) {
            suma = suma +i:
        }
        System.out.println(suma);

         */
    }
}
