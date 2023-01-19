package EstructurasDeControl;

public class Ejercicio43 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5,
añadiendo un salto de línea cada 10 números.
         */
            int numero = 1;
            int contador = 0;

            do {
                if (numero % 5 == 0){
                    System.out.print(numero + " ");
                    contador++;

                } else if (contador % 10 == 0) {
                    System.out.println();
                }
                numero++;
            }while (contador < 50);
    }
}

