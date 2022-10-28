package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio12 {
    /*
    12. Realiza un programa que pida una fecha (día, mes y año) y compruebe si componen
una fecha correcta.
Ejemplos en caso de que la fecha sea correcta:
Ejemplo1:

Ejemplo2:

Ejemplo en el caso de que la fecha sea incorrecta:

Para que una fecha sea correcta,
• El año introducido tiene que ser distinto de 0.
• El mes introducido tiene que estar en el rango 1..12
• El día introducido:
o en los meses de 30 días, debe estar en el rango 1..30
o en los meses de 31 días, debe estar en el rango 1..31

3

o en febrero, debe estar en el rango 1..28, excepto si el año es bisiesto, en cuyo
caso el rango es 1..29.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Día: ");
        int dia = sc.nextInt();
        System.out.println("Mes: ");
        int mes = sc.nextInt();
        System.out.println("Año: ");
        int año = sc.nextInt();

        //Empezamos comprobando el año
        if (año !=0) {
            if (mes >= 1 && mes <= 12) {
                if ( (dia >= 1 && dia <=31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8|| mes == 10 || mes == 12) ) {
                    System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);

                }else if ((dia >= 1 && dia <=30) && (mes == 4 || mes == 6 || mes == 11)){
                    System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);

                }else if ((dia >= 1 && dia <=29) && mes==2){
                    if (año % 4 == 0 && !(año % 100 == 0) || año % 400 == 0) {
                        System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);

                } else if ((dia >= 1 && dia <=28) && mes==2) {
                        if(!(año % 4 == 0 && !(año % 100 == 0) || año % 400 == 0)) {
                        }
                        System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + año);
                        }
                    }
                }else{
                }
                System.out.println("Fecha incorrecta.");
        }else{
            System.out.println("Fecha incorrecta.");
        }
    }
}
