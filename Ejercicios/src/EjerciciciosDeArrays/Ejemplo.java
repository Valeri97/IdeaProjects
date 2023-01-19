package EjerciciciosDeArrays;

public class Ejemplo {
    /*
    Uno más complicado: comprobar si un array está ordenado.
El siguiente programa comprueba si el array dado está ordenado en orden ascendente
e imprime "ORDENADO", de lo contrario imprime "DESORDENADO".
     */
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 10, 6 };
        // Declaramos una variable para indicar si está ordenado (flag).

        boolean ordenado = true;
        for (int i = 0; i < nums.length - 2; i++) { // Me quedo en la penúltima posición.
            if (nums[i] <= nums [i + 1]){
                // Si el que estoy mirando es menor o igual que el siguiente, vamos bien
                // No hago nada y sigo
            } else { // Si se mete aquí es que nums [i] es mayor que la siguiente -> está desordenado
                ordenado = false;
                break;
            }
        }
        // Al final el for es cuando
        if (ordenado) {
            System.out.println("Ordenado");
        } else {
            System.out.println("Desordenado");
        }
    }
}
