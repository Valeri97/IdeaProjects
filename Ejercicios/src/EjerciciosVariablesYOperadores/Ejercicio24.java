package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
importe a abonar.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio de venta del producto");
        double precio = sc.nextDouble();

        System.out.println("Cantidad de productos comprados");
        int cantidad = sc.nextInt();

        System.out.println("Porcentaje de IVA aplicado");
        double iva = sc.nextDouble();
        double ivaTotal = iva / 100;

        double importe = precio * cantidad * ivaTotal;
        System.out.println("El importe a abonar es: "  + ((precio * cantidad) + importe));
    }
}
