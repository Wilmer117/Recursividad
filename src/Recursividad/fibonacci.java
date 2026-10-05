package Recursividad;

import java.util.Scanner;

public class fibonacci {

    public static int calcularFibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }

        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el limite de la serie: ");
        int limite = entrada.nextInt();

        if (limite < 0) {
            System.out.println("El limite debe ser mayor o igual a 0.");
        } else {
            System.out.println("Serie de Fibonacci:");

            for (int i = 0; i <= limite; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }

            System.out.println();
        }
    }
}
