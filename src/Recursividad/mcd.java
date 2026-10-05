package Recursividad;

import java.util.Scanner;

public class mcd {

    public static int calcularMCD(int m, int n) {
        if (n == 0) {
            return m;
        }

        return calcularMCD(n, m % n);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int m = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n = entrada.nextInt();

        m = Math.abs(m);
        n = Math.abs(n);

        System.out.println("M.C.D.: " + calcularMCD(m, n));
    }
}
