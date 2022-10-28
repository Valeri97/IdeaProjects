package EjermplosDeClase;

public class EjemploIncrementoyDecremento {
    //De momento no le vamos a ver utilidad.
    //Pero es superútil cuando veamos bucles: for, while, do- while

    //Se utilizan cuando queremos  que una variable aumente a disminuya en una unidad.

    public static void main(String[] args) {
        int n = 10;
        System.out.println("1. " + n);
        n = n + 1;

        System.out.println("2. " + n);
        //Esto mismo lo podría haber hecho así.
        n++;     //Incrementa el valor de n en 1 - es lo mismo que n = n + 1
        System.out.println("3. " + n);
        //Otra forma de escribir eso mismo es
        n+= 1;   //Esta nomenclatura vale también para el producto (n * = 1) etc...

        System.out.println("4, " + n);
        // y una opción más de escribir lo mismo (pero no es exactamnete igual)
        ++n;
        System.out.println("5. " + n);
        //Lo mimo para el decremento
        //si quiero que la variable disminuya en 1 unidad puedo hacerlo de dos formas.

        n = n -1;
        n--;
        n-= 1;
        --n;
        System.out.println("Decremento tras decremento..." + n);

        //Diferencia entre prefijo ++ o sufijo
        int a = 4;
        int b = a++;    //Primero asigna "a" a "b"
        System.out.println("b: " + b);
        System.out.println(b++);
        System.out.println(a);
    }
}
