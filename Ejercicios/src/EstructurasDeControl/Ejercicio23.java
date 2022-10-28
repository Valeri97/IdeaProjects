package EstructurasDeControl;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive)
usando el bucle for.
         */
        //Un truco que se utiliza a veces cuando tienes que ir acumulando un resultado es utilizar un "sumador" o acumulador, que es una variable que comienza en 0 normalmente y le vas sumando resultados parciales.
        int suma = 0;
        for ( int i =1; i <= 10; i++){
            suma = suma + i;
        }
        System.out.println("Resultado= " + suma);
    }
}
