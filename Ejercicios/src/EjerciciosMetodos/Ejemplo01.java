package EjerciciosMetodos;

import java.util.Scanner;

public class Ejemplo01 {
    // Podemos declarar un Scanner estático para declarar en toda la clase, y así no tengo que declarar un Scanner en cada método
    // Pero si lo quiero declarar uno en cada método también se puede.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // A los otros métodos los llamamos desde aquí
        System.out.println("Dime un nombre");
        String nombre1 = sc.nextLine();
        String nombre = "Valeria";
            // Quiero utilizar el método imprimeNombre para imprimir la variable nombre.
            // Llamo al método imprimeNombre
        imprimeNombre("Ana"); // Llamo al método imprimeNombre con el argumento
        imprimeNombre(nombre);
        int longitud = nombre.length(); // esto es invocar al método length()

        imprimeLongitud(nombre1);

        String nombre2 = pideNombre(); // ese String lo guardo en una variable
    }
    // Aquí dentro de la clase pero fuera del main, escribimos los otros métodos.
    // Un método siempre tiene public, static, tipoDeLoQueDevuelve, nombreDelMétodo (parámetros -o no-){
            //las instrucciones que se ejecutan al llamar o invocar al método
    public static void imprimeNombre(String n){ // Al parámetro le tengo que poner el tipo de parámetro que es, y el nombre que yo quiera.
        System.out.println(n);
    }
    // Declara un método que reciba un String e imprima su longitud
    public static void imprimeLongitud(String apellido){
        // Imprimo la longitud de apellido
        System.out.println(apellido.length());
    }
    // Declara un método que no reciba nada, pregunta un nombre y lo devuelve.
    public static String pideNombre(){
        System.out.println("Dime otro nombre");
        String nombre2 = sc.nextLine();
        // Siempre que devuelve algo hay que poner return
        return  nombre2 ;
    }
}
