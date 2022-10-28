package EjermplosDeClase;

import java.util.Scanner;

public class EjemplosElementosBásicos {
    public static void main(String[] args) {
        System.out.println("Números enteros");
        System.out.println("===============");
        System.out.println(1_000_000_000);
        System.out.println("\n\nCaracteres");
        System.out.println("===============");
        System.out.println("Los caracteres se representan con comillas simples");
        System.out.println("Por ejemplo: " + 'a');
        System.out.println("Por ejemplo: " + '5');
        System.out.println("también puede ser un espacio en blanco" + ' ' + ".");
        System.out.println("\n\nCadena de caracteres");
        System.out.println("=========================");
        System.out.println(123 + 2 + " 123");

    }

    public static class EjemplosLeerPorTeclado {
        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            //Ahora ya podemos meter datos por teclado
            //Pero para poder utilizarlos después en el programa
            //tenemos que guardarlos en una variable
            //Las variables se gaurdan en palabras o cadenas de texto que se llaman String
            System.out.println("Introduce tu nombre: ");
            String nombre = teclado.nextLine(); //escribo mi nombre en el teclado y lo guardo en la variable nombre
            System.out.println("Hola," + nombre);

            System.out.println("Introduce tus apellidos: ");
            //Creo otra variable para guardar el apellido que va a entrar por teclado
            String apellidos = teclado.nextLine();
            System.out.println("Hola, " + nombre + " " +  apellidos);

            System.out.println("¿Cuántos años tienes?:");
            int edad = teclado.nextInt();
            System.out.println("Vaya, pareces muy joven para tener " + edad + " años");

            //El método NextInt tiene un peligro, si a continuación pones un NextLine() se lo salta.
            //La manera de evitarlo es: cada vez que yo escribo NextInt(), si sé que luego voy a meter un NextLine (), escribo un NetxtLine () adicional, sin más, de esta manera "Limpiamos" el teclado.

            teclado.nextLine(); //Esto es solo para evitar que salte la pregunta siguiente.
            System.out.println("¿Tienes mascotas?: ");
            String mascota = teclado.nextLine();
            System.out.println("Pues muy bien");

            //Vamos a meter un dato con decimales
            System.out.println("¿Y cual es tu patrimonio?");
            double patrimonio = teclado.nextDouble();
            System.out.println("Oh ¡" + patrimonio + "!");
            //Cuando escribimos los decimales en el código fuente se pone "."
            //Cuando metemos los datos por teclado se pone ","

            }
        }

    public static class EjemplosVariables {
        public static void main(String[] args) {
            //Variables
            int a = 5; //Declaro la variable a, y a continuación guardo en ello el valor 5
            //Las variables se declaran en minúscula
            System.out.println("La variable a vale " + a);
            //Su valor puede ser modificado en cualquier momento
            a = 8;
            System.out.println("La variable a vale " + a);
            //Reglas para nombrar variables
            //No puede comenzar por ningún dígito
            //int 5c= 4; no compila
            //Puede contener cualquier letra o dígito
            //int c58=2
            //No puede contener ningún caracter especial(signos de puntuación,...)
            //a excepción de caracteres _ y $
            int _variable = 3;
            int $otravariable = 4;
            //No puede contener espacios
            // int otra variables; no compila

            System.out.println("Tipos de variables");
            System.out.println("==================");
            System.out.println("Las variables se declara poniendo 1º el tipo de variable que es y 2º el nombre que le damos a la variable");
            System.out.println("Variables para números enteros: byte, Short, ");
            System.out.println("Byte");
            byte variableBytePos = 127; //es el número más grande que puedo guardar en una variable de tipo byte
            byte variableByteNeg = -128; //es el número más pequeño que puedo guardar en una variable de tipo byte
            System.out.println("variableBytePos = " + variableBytePos);
            System.out.println("variableBiteNeg = " + variableByteNeg);
            System.out.println("Números con decimales: float o double");
            //int decimal = 3.14    No me funciona no int, hay que usar double
            double decimal = 3.14;
            double numero =3;
            System.out.println(numero);
            float otroDecimal = 8.43f; //Así declaramos una variable de tipo float ponemos una f después del número
            System.out.println(otroDecimal);


            System.out.println("=================================");

            //Formas alternativas de declarar una variable (Pag 11)
            String lneguaje = "Java";
            String version ="8 o superior";

            // Esto también se puede hacer así
            String lenguaje1 = "Java", version1 = "10 o superior";
            int num1 = 5, num2 = 10; //declaro dos variables de tipo int en la misma línea

            //También se podría hacer.
            int num3; //Aquí declaro la variable sin asignar nada.
            num3 = 6;
            num3 = num1; //Aquí guarda en num3 el valor 5
            System.out.println(num3);

            //Inferencia de tipos.
            var variable = "Hola";
            var otraVariable = 10;
        }
    }
}