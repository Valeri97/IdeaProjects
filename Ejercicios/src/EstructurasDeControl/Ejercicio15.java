package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Tenemos un programa que pregunta a los estudiantes qué lenguaje de
programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
Java, Kotlin, Scala o Python
Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
el resultado de la prueba: " ¡Sí! ", " ¡No! " u "Opción desconocida". La respuesta
correcta es Java (obviamente).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Que lenguaje de programación están estudiando: \n1. Java. \n2. Kotlin. \n3. Scala. \n4. Python");
        int estudios = sc.nextInt();
        if (estudios > 1 && estudios <= 4){
            System.out.println("¡No!");
        } else if (estudios == 1) {
            System.out.println("¡Si!");
        }else{
            System.out.println("Opción desconocida");
        }
    }
}
