package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
impuestos. Si no lo supera, que indique que no debe abonarlos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Salario Anual: ");
        int SalarioAnual = sc.nextInt();
        if (SalarioAnual > 9000) {
            System.out.println("Debe abonar impuestos");
        }else{
            System.out.println("Al no superarlos no debe abonar impuestos");
        }

    }
}
