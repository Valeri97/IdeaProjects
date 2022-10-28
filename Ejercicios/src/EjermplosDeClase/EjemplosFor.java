package EjermplosDeClase;

public class EjemplosFor {
    public static void main(String[] args) {
        // Queremos imprimir todos los números del 0 al 10 (ambos inclusive)
        for (int i = 0; i <= 10; i++) {
            // Desde que i es igual a 0 y mientras i sea menor o igual que 10 vamos incrementando la i de 1 en 1.
            //Dentro del bloque escribimos lo que se tiene que hacer en cada repetición.
            System.out.println(i);
        }
        // Se pueden hacer el for de diferentes tipos
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
        //Queremos imprimir de 10 a 0 de 1 en 1.
        for (int i = 10; i >=0; i--){
            System.out.println(i);
        }
    }
}
