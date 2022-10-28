package EjermplosDeClase;

import java.util.Scanner;

public class EjemploBoolean {
    public static void main(String[] args) {
        System.out.println("Operadores lógicos");
        boolean apto = false;
        System.out.println("Es apto?: " + apto);

        /*Los operadores lógicos son:
        - Unarios:  !NOT    -- te cambia el vslor que le hayas dado a true o false
        - Binario: se utilizan con dos variables
           + AND "y"
           + OR "o"
           + XOR  "^"
         */
        System.out.println(!apto); //Unario

        //AND
        System.out.println("AND: ");
        Boolean v1 = true;
        Boolean v2 = true;
        Boolean v3 = v1 && v2;

        System.out.println(v3);

        //OR
        System.out.println("OR: ");
        boolean v4 = v1 || v2;
        System.out.println(v4);

        //XOR
        System.out.println("XOR:");
        boolean v5 = v1 ^ v2;
        System.out.println(v5);

        System.out.println("==================================");
        System.out.println("Operadores Racionales");
        int num1= 35;
        int num2 = 23;
        num2 = num1; //Estoy asignando a num2 el valor de num1.
        boolean comparacion = num2 == num1; //Estoy comparando ambas variables y el resultado que es (true) lo asigno a comparación.
        boolean otraComparacion = num2 != num1;

        int nueve = 9;
        int nueve2 = 9;
        int diez = 10;
        System.out.println(nueve > nueve2);
        System.out.println(nueve >= nueve2);

        int edad = 18;
        System.out.println("¿Mayor de edad? " + (edad >= 18));

        //Cuando aparecen operadores mezclados de distintos tipos el orden es
        /*
        1 - Parentesis
        2 - incrementos y decrementos.
        3 - Operadores aritméticos.
        4 - Operadores relacionales.
        5 - Operadores lógicos.
         */

        int num = 100;
        boolean resultado = num + 10 > num + 9;

        // Unir operaciones relaciones usando operadores lógicos.
        int a = 5;
        int b = 6;
        int c = 7;

        /* Quiero saber si a <= b <= c
        System.out.println(a <= b <= c); Esto java no lo entiende
         */

        //Hay que hacer una comparación de dos en dos con un and
        System.out.println(a <= b && b <= c);

        //Ejemplo pedimos 3 estaturas por teclado y queremos ver si están en orden ascendente
        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        boolean ordenAscendente = estatura1 <= estatura2 && estatura2 <= estatura3;
        System.out.println("Orden Ascendente: " + ordenAscendente);

        boolean ordenDescendente = estatura1 >= estatura2 && estatura2 >= estatura3;
        System.out.println("Orden Descendente: " + ordenDescendente);


    }
}
