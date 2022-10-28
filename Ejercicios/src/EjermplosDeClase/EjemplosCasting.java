package EjermplosDeClase;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puedo asignar un int a long sin más (casting implícito)
        // y al revés?
        long numGrande2 = 101; //Long ocupa 64 bit
        int entero = (int) numGrande2; //esto es un casting EXPLÍCITO.

        //De int a short --> CASTING EXPLÍCITO
        short numeroCorto = (short) num; //No puedo hacerlo directamete porque int son 32 bits y no caben en 16 bits que es ahort, pero puedo forzarlo.

        //De char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        //De Float a double
        float decimal = 3.1416f;
        double decimalDoble = decimal;

        //De double a float
        double decimalDoble2 = 3.141621;
        float decimalF = (float) decimalDoble2;

        //De double a int
        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits); //Resultado imprevisible

        //De double a short
        short entero16bits = (short) decimalDoble2;
        System.out.println(entero16bits);
    }
}
