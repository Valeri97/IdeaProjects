package EstructurasDeControl;

public class Ejercicio42 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
         */
        int num = 1;
        int contador = 0;
        while (contador < 20){
            if (num % 5 == 0){
                System.out.println(num);
                // Cada vez que encontramos un múltiplo incrementamos el contador.
                contador++;
            }
            num++;
        }
    }
}
