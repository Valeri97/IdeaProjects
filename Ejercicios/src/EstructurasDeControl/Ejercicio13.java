package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
venta del producto, ésta es de un solo tipo (A o B) y tamaño (1 o 2). Al comenzar el
programa pide el precio inicial, tipo, tamaño de la uva y kilos que se van a vender en
un embarque. Se requiere determinar cuánto recibirá un productor por la uva que
entrega en un embarque, considerando lo siguiente:
a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño
1; y 30 céntimos si es de tamaño 2.
b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
cuando es de tamaño 2.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio inicial: ");
        double precioInicial = sc.nextDouble();
        System.out.println("tipo de uva (A o B): ");
        char tipo = sc.next().charAt(0);
        System.out.println("tamaño de la uva (1 0 2): ");
        int tam = sc.nextInt();
        System.out.println("kilos que se van a vender en un embarque: ");
        double kg = sc.nextDouble();
        double precio; // creo esta variable para guardar el precio según el caso.

        if (tipo == 'A'){
            if (tam == 1){
                precio = precioInicial + 0.2;
                double precioTotal = precio * kg;
                System.out.println("A pagar: " + precioTotal + "€.");
            } else if (tam == 2 ) {
                precio = precioInicial + 0.3;
                double precioTotal = precio * kg;
                System.out.println("A pagar: " + precioTotal + "€.");
            }else{
                System.out.println("Precio incorrecto");
            }
        }else{
            if (tam == 1){
                precio = precioInicial - 0.3;
                double precioTotal = precio * kg;
                System.out.println("A pagar: " + precioTotal + "€.");
            } else if (tam == 2) {
                precio = precioInicial - 0.5;
                double precioTotal = precio * kg;
                System.out.println("A pagar: " + precioTotal + "€.");
            }else{
                System.out.println("Precio incorrecto");

            }
        }
    }
}
