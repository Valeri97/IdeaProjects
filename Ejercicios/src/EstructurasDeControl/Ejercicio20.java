package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1");
        int n1 = sc.nextInt();
        System.out.println("Número 2");
        int n2 = sc.nextInt();
        System.out.println("Operación a realizar");
        char operacion = sc.next().charAt(0); //Se escribe asi guardar la variable char por teclado
        int resultado = 0;
        //Miro el valor de la variable operación, y en función de eso hago una variable u otra
        switch (operacion) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operación incorrecta");
        }
        System.out.println("Resultado: " + resultado);
    }
}
