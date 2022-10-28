package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
desea saber cuanto deberá pagar finalmente por su compra.
         */
        Scanner sc=  new Scanner(System.in);
        System.out.println("Compra total");
        double compra = sc.nextDouble();

        double DescuentoSobreCompra = compra * 0.15;

        double PagoTotal = compra - DescuentoSobreCompra;
        System.out.println("El pago total que tiene que hacer es: " + PagoTotal);
    }
}
