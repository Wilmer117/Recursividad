package Recursividad;

import java.util.Scanner;

public class multiplicacion {

    public static int multiplicar(int numero1, int numero2) {
        if (numero2 == 0) {
            return 0;
        }

        return numero1 + multiplicar(numero1, numero2 - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();

        int signo = 1;

        if (numero2 < 0) {
            signo = -1;
            numero2 = -numero2;
        }

        System.out.println("Multiplicacion: " + signo * multiplicar(numero1, numero2));
    }
}
