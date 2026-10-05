package Recursividad;

import java.util.Scanner;

public class ackermann {

    public static long calcularAckermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }

        if (n == 0) {
            return calcularAckermann(m - 1, 1);
        }

        return calcularAckermann(m - 1,
                (int) calcularAckermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese m: ");
        int m = entrada.nextInt();

        System.out.print("Ingrese n: ");
        int n = entrada.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("valores deben ser mayores o iguales a 0.");
        } else {
            System.out.println("Ackermann(" + m + ", " + n + ") = "
                    + calcularAckermann(m, n));
        }
    }
}
