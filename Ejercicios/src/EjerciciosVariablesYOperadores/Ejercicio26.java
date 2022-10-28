package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
su sueldo base y comisiones.
         */
        Scanner sc=  new Scanner(System.in);
        System.out.println("Sueldo Base");
        double sueldo = sc.nextDouble();

        System.out.println("Importe venta 1");
        double venta1 = sc.nextDouble();

        System.out.println("Importe venta 2");
        double venta2 = sc.nextDouble();

        System.out.println("Importe venta 3");
        double venta3 = sc.nextDouble();

        double VentasConComision = (venta1 + venta2 + venta3) * (0.1);
        System.out.println("sueldo total: " + sueldo + VentasConComision);
    }
}
