package ForAnidado;

import java.util.Scanner;

/**
 *  Estos ejercicios están en la hoja de ejercicios de estructuras de control de la primera evaluación.
 */

public class EjerciciosForAnidados {
    // Utilizamos un scanner estático, fuera del main
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Vamos a mostrar el menú y hacer ejercicios hasta que nos cansemos
        String seguir = "";
        do {
            // Muestra el menú
            int ejercicio = menu(); // En la variable ejercicio tengo el número

            // Con un switch según me hayan indicado un ejercicio u otro.
            switch (ejercicio){
                case 27:
                    ejercicio27(); // Llamamos al método donde está desarrollado el ejercicio 27.
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 35:
                    ejercicio35();
                    break;
                default:
                    System.out.println("Ese ejercicio no entra aquí");
            }
            System.out.println("¿Quieres hacer otro ejercicio? (S/N)");
            seguir = sc.nextLine().substring(0,1); // Cogemos solamente la primera letra por si alguien pone sí o no
        } while (seguir.equalsIgnoreCase("S"));
    }
    public static void ejercicio27() {
        String enunciado = "Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\n" +
                "rectángulo en que la base sea el número mayor y la altura el número menor, con un\n" +
                "carácter también introducido por teclado.";
        System.out.println(enunciado);
        // Ahora resolvemos este ejercicio
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        sc.nextLine(); // Se pone por precaución.
        System.out.println("Introduce un caracter: ");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n; i++) { // Con el primer for (i)  lo que se dibuja es la fila
            for (int j = 0; j < n; j++) {
                System.out.print(c + "\t"); // Se quita el ln del print para que no haga un salto de línea y dibuje bien el cuadrado.
            }
            // Al finalizar el bucle interno meto un salto de línea
            System.out.println();
        }
    }

    public static void ejercicio28() {
        String enunciado = "Escribe un programa que, dado un número n introducido por teclado, dibuje un\n" +
                "cuadrado de dimensiones n * n, con un carácter también introducido por teclado.";
        System.out.println(enunciado);
        // Ahora resolvemos este ejercicio.
        System.out.println("Introduce a: ");
        int a = sc.nextInt(); sc.nextLine();

        System.out.println("Introduce b: ");
        int b = sc.nextInt();
        sc.nextLine();
        // Las filas (lo alto) lo da el primer for (i)
        System.out.println("Introduce un carácter");
        char c = sc.nextLine().charAt(0);
        // Ahora tengo que ver cuál es la base (la altura)
        int base = 0;
        int altura = 0;
        if (a > b){
            base = a;
            altura = b;
        } else {
            base = b;
            altura = a;
        }
        //Ahora pintamos el rectángulo:
        // Tantas filas como sea la altura -> (for externo).
        for (int i = 0; i < altura; i++) {
            // Para cada fila, pinta tantos carácteres como la base
            for (int j = 0; j < base; j++) {
                System.out.print(c + "\t"); // Se le quita el ln para que no haga el salto de línea
            }
            // Cada vez que termino de pintar una fila, meto un salto de línea.
            System.out.println();
        }
    }
    public static void ejercicio29() {
        String enunciado = "Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de\n" +
                "multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas\n" +
                "puedes usar el tabulador";
        System.out.println(enunciado);
        // Ahora resolvemos este ejercicio.
        System.out.println("Dime un número");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    public static void ejercicio35() {
        String enunciado = "Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,\n" +
                "siendo n un número introducido por teclado, utilizando asteriscos (*).";
        System.out.println(enunciado);
        // Ahora resolvemos este ejercicio.
        System.out.println("Dime un número para la base:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime un carácter:");
        char c = sc.nextLine().charAt(0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { // Si se pone solo la i ej: for (int j = 0; j < i; j++) el cuadro se va a pintar de menor a mayor con el pico arriba
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    // Hacemos un método o menú que pregunta que ejercicios quieres hacer: entre el 27, 28, 29 o 35
    // Y devuelve el número de ejercicio a realizar.
    public static int menu(){
        System.out.println("¿Qué ejercicio quieres hacer? \n27. \n28. \n29. \n35.");
        int ejercicio = sc.nextInt();
        // Ponemos después de sc NextInt() esto para que no nos haga el salto de linea
        sc.nextLine();
        return ejercicio;
    }
}
