package EjerciciciosDeArrays;

public class Ejercicio24 {
    /*
   Crea un programa que:
Declara una tabla de números, bidimensional, de tamaño 5x15 y nombre ‘marco’.

Carga la tabla con dos únicos valores: 0 y 1, donde el valor 1 ocupará las
posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
que el resto de los elementos contendrán el valor 0.
     */
    public static void main(String[] args) {
        int [][] marco = new int [5][15];// El primer corchete indica cuantas filas voya a tener y el segundo corchete indica cuantas columnas.

        // Lo rellenamos:
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 14) { // En la fila 0 y 4, y en la columna 0 y 14, meto 1.
                    marco[i][j] = 1;
                } // No hace falta poner un else porque el Array lo rellena automáticamente de 0
            }
        }
        // Lo pintamos
        for (int i = 0; i < 5; i++) { // 5 también lo podría poner como tabla.length
            for (int j = 0; j < 15; j++) { // 15 también lo podría poner como tabla[i].length
                System.out.print(marco[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
