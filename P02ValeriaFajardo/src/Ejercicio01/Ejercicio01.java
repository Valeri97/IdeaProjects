package Ejercicio01;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Programa entre 1 y mil y sus dígitos
         */
        int numAleatorio = (int) (Math.random() * 1000 + 1);
        System.out.println(numAleatorio);
        if (numAleatorio >= 1 && numAleatorio <=9) {
            System.out.println("El número " + numAleatorio + " es de un dígito");
        } else if (numAleatorio >= 10 && numAleatorio <=99 ) {
            System.out.println("El número " + numAleatorio + " es de dos dígitos");
        } else if (numAleatorio >= 100 && numAleatorio <=999) {
            System.out.println("El número " + numAleatorio + " es de tres dígitos");
        }else{
            System.out.println("El número " + numAleatorio + " es de cuatro dígitos");
        }
    }
}
