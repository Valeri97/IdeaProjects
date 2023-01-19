package EjermplosDeClase;

public class EjemplosForAnidado {
    public static void main(String[] args) {
        // Un for anidado es un for que s eutiliza dentro de otro for.
        // Entonces tendremos un for externo, cuya variable duele llamarse i.
        // Y metemos dentro de un for interno, cuya variable suele llamarse j.
        // La lógica que sigue es: por cada UNA de las vueltas del bucle externo.
        //El bucle interno ejecuta TODAS sus repeticiones.
        for (int i = 0; i < 5; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("    j = " + j);
            }
        }
    }
}
