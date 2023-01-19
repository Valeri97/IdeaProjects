package EjermplosDeClase;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        // Declarar un array
        // tipo [] nombre; o también se puede hacer: tipo nombre [];
        double [] elementos;

        // Inicializar ->instanciar = crear un objeto de tipo array
        elementos = new double[5]; // Aquí estoy guardando espacio en memoria

        // Lo rellenamos, dándole un valor a cada una de las posiciones
        elementos [0] = 10.8;
        elementos [1] = 14.3;
        elementos [2] = 13.5;
        elementos [3] = 12.1;
        elementos [4] = 9.7;

        // Normalmente declaramos e inicializamos a la vez
        String [] DiasLaborables = new String[5];
        DiasLaborables [0] = "Lunes";
        DiasLaborables [1] = "Martes";
        DiasLaborables [2] = "Miércoles";
        DiasLaborables [3] = "Jueves";
        DiasLaborables [4] = "Viernes";
        // Si añadimos más del número que hemos puesto nos dará un error de ejecución
        // Hay un caso en el que no puedo decir el tamaño,
        // Si lo relleno directamente
        String [] meses = {"Enero" , "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre" }; // En vez de new y tal pongo las llaves y dentro los valores separados por comas

        // Para imprimirlos

        // A. Con for
        for (int i = 0; i < elementos.length; i++) { // ojo; en String era length ()
            System.out.println(elementos[i] + " ");
        }
        // B. Con el método toString () de la clase Arrays
        System.out.println("\n" + Arrays.toString(DiasLaborables));

        // C. Con foreach -> Es una variante simplificada del bucle for.
            /*
                for (tipoDelArray: nombreDeElemento) {
                    System.out.println(nombreDelElemento);
                }
             */
        for (String elemento: meses) {
            System.out.print(elemento + ", ");
        }
        // No funciona -> System.out.println(elementos);
        // No funciona -> System.out.println(DiasLaborables);
        // No funciona -> System.out.println(meses);
    }
}
