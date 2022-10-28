package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
“no” (en vez de true/false).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Es culpable o no? (S/N) ");
        String culpable = sc.nextLine();
        if (culpable.equals("S")) { //La comparación ese strings se hace mediante el método equal
            //Queremos decir si la variable es igual a "S"
            System.out.println("¡A la carcel!");

        } else if (culpable.equals("N")){
            System.out.println("¡A casa!");
        }else{
            System.out.println("No me vaciles");
        }
    }
}
