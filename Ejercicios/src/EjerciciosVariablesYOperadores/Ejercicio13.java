package EjerciciosVariablesYOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Escribe un programa que, dado un importe en euros, indique el número mínimo de
billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
Por ejemplo:

232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros
*/
        Scanner sc = new Scanner(System.in);
        int euros = sc.nextInt();
        int billetes500 = euros / 500; //En el resto quedan los demás.
        int resto = euros % 500;

        int billetes200 = resto / 200;
        resto = resto % 200;

        int billetes100 = resto / 100;
        resto = resto % 100;

        int billetes50 = resto / 50;
        resto = resto % 50;

        int billetes20 = resto / 20;
        resto = resto % 20;

        int billetes10 = resto / 10;
        resto = resto % 10;

        int billetes5 = resto / 5;
        resto = resto % 5;

        int monedas2 = resto / 2;
        int monedas1 = resto % 2;

        System.out.println(euros + " euros: " + billetes500 + " billetes de 500, " + billetes200 + " billetes de 200, " + billetes100 + " billetes de 100, " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 y " + monedas1 + " monedas de 1.");

    }
}
