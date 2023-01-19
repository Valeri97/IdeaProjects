package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        El director de una escuela está organizando un viaje de estudios, y requiere
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
de viajes por el servicio. La forma de cobrar es la siguiente:

a. Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
b. de 50 a 99 alumnos, el costo es de 70 euros,
c. de 30 a 49, de 95 euros,
d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
importar el número de alumnos.
Escribe un programa que, introduciendo el número de alumnos que van de viaje,
permita determinar el pago a la compañía de autobuses y lo que debe pagar
cada alumno.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos van al viaje?: ");
        int alumnos = sc.nextInt();
        if (alumnos >= 100){
            int precio1 = 65;
            int total1= precio1 * alumnos;
            System.out.println("El coste del viaje por alumno sería de " + precio1);
            System.out.println("El pago total que hay que hacer a la compañia de autobuses sería de: " + total1);
        } else if (alumnos >= 50 && alumnos <= 99) {
            int precio2 = 70;
            int total2= precio2 * alumnos;
            System.out.println("El coste del viaje por alumno sería de " + precio2);
            System.out.println("El pago total que hay que hacer a la compañia de autobuses sería de: " + total2);
        } else if (alumnos >= 30 && alumnos <= 49) {
            int precio3 = 95;
            int total3= precio3 * alumnos;
            System.out.println("El coste del viaje por alumno sería de " + precio3);
            System.out.println("El pago total que hay que hacer a la compañia de autobuses sería de: " + total3);
        } else if (alumnos < 30) {
            int total4= 4000;
            int precio4 = total4 / alumnos;
            System.out.println("El coste del viaje por alumno sería de " + precio4);
            System.out.println("El pago total que hay que hacer a la compañia de autobuses sería de: " + total4);
        }
    }
}
