package Recursividad;

import java.util.Scanner;

public class potencia {

    public static long calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * calcularPotencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();

        if (exponente < 0) {
            System.out.println("Para este ejercicio el exponente debe ser mayor o igual a 0.");
        } else {
            System.out.println("Resultado: " + calcularPotencia(base, exponente));
        }
    }
}
