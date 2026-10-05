package Recursividad;

import java.util.Scanner;

public class factorial {

    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("Factorial: " + calcularFactorial(numero));
    }
}
