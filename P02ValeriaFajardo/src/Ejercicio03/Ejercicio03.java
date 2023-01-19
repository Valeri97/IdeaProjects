package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        programa que simule la pantalla de un cajero automático muy básico. suponemos que tenemos una cuenta de un saldo inicial
        de 1000e
        */
        Scanner sc = new Scanner(System.in);
        int consulta = 0;
        int saldo = 1000;
        do {
            System.out.println("Consultar: \n1.Consultar Saldo. \n2.Ingresar dinero. \n3.Retirar dinero. \n4.salir.");
            consulta = sc.nextInt();
            switch (consulta){
                case 1:
                    System.out.println("El saldo de su cuenta es: " + saldo);
                    break;
                case 2 :
                    System.out.println("¿Cuanto dinero va a ingresar? " );
                    int ingreso = sc.nextInt();
                    saldo = saldo + ingreso;
                    System.out.println("El saldo actual de su cuenta es: " + saldo);
                    break;
                case 3 :
                    System.out.println("¿Cuanto dinero va a retirar? " );
                    int retirada = sc.nextInt();
                    if (retirada > saldo){
                        System.out.println("No tiene saldo suficiente en su cuenta, no se puede realizar la operación");
                    } else {
                        saldo = saldo - retirada;
                        System.out.println("El saldo actual de su cuenta es:" + saldo);
                    }
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while (consulta !=4);
        System.out.println("Ha salido. Un placer");

    }
}
