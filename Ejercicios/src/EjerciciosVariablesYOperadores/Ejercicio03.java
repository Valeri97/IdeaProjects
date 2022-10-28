package EjerciciosVariablesYOperadores;

public class Ejercicio03 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        //Crear variables que guarden el resultado de las cinco operaciones posibles.
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2; //OJO: es el cociente de la división entera.
        int resto = num1 % num2;

        //Mostrar el resultado de cada operación.
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es igual a " + resto);

    }
}
