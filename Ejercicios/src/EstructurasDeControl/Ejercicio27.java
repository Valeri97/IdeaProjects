package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*
        Escribe un programa que, dado un número n introducido por teclado, dibuje un
cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
Ejemplo:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número positivo: ");
        int n = sc.nextInt();
        if (n > 0){
            System.out.println("Caracter: ");
            // Ahora pedimos el caracter para dibujar el cuadrado.
            char c = sc.next().charAt(0);
            //Ahora dibujamos el cuadrado.
            // Vamos a utilizar el for externo para las filas.
            for (int i = 0; i < n; i++) { // Si n = 4, dibujará la fila 0,1,2,3.
                //Y vamos a utilizar el for interno para las columnas (da igual en este ejercicio que veas las filas como i y las columnas como j).
                for (int j = 0; j < n; j++) {
                    System.out.print(c + " ");

                }
// Este salto de línea lo queremos para cuando termine de imprimir una fila, osea un for interno completo.
                System.out.println(" ");
            }
        }else{
            System.out.println("El número no puede ser negativo ni cero");
        }
    }
}
