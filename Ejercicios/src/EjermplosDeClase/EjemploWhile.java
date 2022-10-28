package EjermplosDeClase;

public class EjemploWhile {
    public static void main(String[] args) {

    // Vamos a hacer un bucle while, que imprima los números del 0 al 4.
    int i = 0;
    while (i < 5){ // Esto se lee, mientras i < 5 sea true, entramos en el bucle
        // Dentro del bucle imprimimos i
        System.out.println(i);
        //Es importante que dentro del while haya alguna cosa que haga que el bucle pare en algún momento.
        // Normalmente es un valor que hace que la condición sea false
        i++;
    }
        System.out.println("Fuera del bucle");
    /*
    Hacer los siguientes ejemplos con while.
    for (int i = 1; i < 11; i = i + 2) {
            System.out.println(i);
        }
        //Queremos imprimir de 10 a 0 de 1 en 1.
        for (int i = 10; i >=0; i--){
            System.out.println(i);
     */
        int j = 0;
        while (j < 11){
            System.out.println(j);
            j = j + 2;
        }
        System.out.println("=================");
        int k = 10;
        while  (k > 0){
            System.out.println(k);
            k--;
        }
    }
}
