package EjermplosDeClase;

public class EjemploWhileChar {
    public static void main(String[] args) {
        // While combinado con variables tipo char sirve para imprimir una parte de la tabla ASCII.
        // Por ejemplo: las letras mayúsculas.
        char letra ='A';
        while (letra <= 'Z'){
            System.out.println(letra);
            letra++;
        }
    }
}
