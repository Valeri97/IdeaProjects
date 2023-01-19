package EjerciciosString;

import java.util.Scanner;

public class Ejercicio12ConMétodos {
    public static void main(String[] args) {
      /*
      Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
cadenas se introducen por teclado.
       */


        //
        boolean resultado = contieneSubCadena(pideCadena(), pideCadena());
        if(resultado){ // Si dentro del if pongo la variable del boolean es lo mismo que decir resultado == true;
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
    public static String pideCadena (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la cadena");
        String cadena = sc.nextLine();
        return cadena;
    }
    public static boolean contieneSubCadena (String cadena1, String cadena2){

        // Tengo que ver si cadena 2 está dentro de cadena1.
        if (cadena1.contains(cadena2)){
            return true;
        } else {
            return false;
        }
    }
}
