package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio36_26_VyO {
    public static void main(String[] args) {
        /*
        Ejercicio 26: en vez de 3 ventas pedir por teclado el número de ventas realizadas y el
importe de cada venta.
        Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
su sueldo base y comisiones.
         */
        Scanner sc = new Scanner(System.in);
        double venta = 0;
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("La venta " + (i + 1) + " realizada es de: ");
            venta = sc.nextDouble();
            suma = suma + venta;
        }
        suma = suma * 0.1;
        System.out.println("El sueldo base es: ");
        double sueldo = sc.nextDouble();
        double sueldoTotal = sueldo + suma;
        System.out.printf("La comisión total que se lleva por las tres ventas es de: %.2f", sueldoTotal);
    }
}
