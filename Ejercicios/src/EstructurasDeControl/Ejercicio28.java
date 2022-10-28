package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
        Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un
rectángulo en que la base sea el número mayor y la altura el número menor, con un
carácter también introducido por teclado.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("primera medida del cuadrado:");
        int a = sc.nextInt();
        System.out.println("primera medida del cuadrado:");
        int b = sc.nextInt();
        System.out.println("introduce el caracter: ");
        char c = sc.next().charAt(0);
        if (a >= 0  || b >= 0){
            if  (a > b){
                //La base= a y altura = b
                // Las filas van en el bucle externo fila = b, o, altura
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < a ; j++) {
                        System.out.print(c + " ");
                    }
                    System.out.println(" ");
                }
            }else{
                //La base= b y altura = a
                // Las filas van en el bucle externo columna = a, o, base
                for (int i = 0; i < a; i++){
                    for (int j = 0; j < b ; j++){
                        System.out.print(c + " ");
                    }
                    System.out.println(" ");
                }
            }
        }else{
            System.out.println("los medidas deben ser positivas y distintas de cero");
        }
    }
}
