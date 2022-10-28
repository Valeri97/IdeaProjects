package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
    /*
    Escribe un programa que responda a un usuario que quiere comprar un helado en
una conocida marca de comida rápida cuanto le costará en función del topping que
elija.
• El helado sin topping cuesta 1.90€.
• El topping de oreo cuesta 1€.
• El topping de KitKat cuesta 1.50€.
• El topping de brownie cuesta 0.75€.
• El topping de lacasitos cuesta 0.95€.
• En caso de no disponer del topping solicitado por el usuario el programa escribirá
por pantalla «no tenemos este topping, lo sentimos.» y a continuación informará
del precio del helado sin ningún topping.

Finalmente, el programa escribe por pantalla el precio del helado con el topping
seleccionado (o ninguno).
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Elegir un toppíng: sin topping, oreo, kitkat, brownie, lacasitos.");
        String topping = sc.nextLine();
        double precio = 1.90; //Precio del helado
        switch (topping){
            case "sin topping":
                 //No hace falta poner un precio
                break;
            case "oreo":
                precio = precio + 1;
                break;
            case "Kit Kat":
                precio = precio + 1.5;
                break;
            case "Brownie":
                precio = precio + 0.75;
                break;
            case "Lacasitos":
                precio = precio + 0.95;
                break;
            default:
                System.out.println("No tenemos este topping, lo sentimos.");
                System.out.println("El precio del helado sin topping es " + precio);
        }
        System.out.printf("El precio de su helado es: %.2f ", precio, " €.");
    }
}
