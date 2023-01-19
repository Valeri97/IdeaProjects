package EjerciciosInternet;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos número vas a introducir?: ");
        int numerosAIntroducir = sc.nextInt();
        int contadorIgual0= 0;
        int contadorNeg = 0;
        int contadorPos = 0;
        int numero = sc.nextInt();
        for (int i = 0; i < numerosAIntroducir; i++) {
            System.out.println("Números: ");
            numero = sc.nextInt();
            if (numero < 0){
                contadorNeg++;
            } else if (numero == 0) {
                contadorIgual0++;
            }else{
                contadorPos++;
            }
        }
    }
}
