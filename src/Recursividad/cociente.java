package Recursividad;

import java.util.Scanner;

public class cociente {

    public static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }

        return 1 + calcularCociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = entrada.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = entrada.nextInt();

        if (dividendo < 0 || divisor <= 0) {
            System.out.println("Ingrese un dividendo mayor o igual a 0 y un divisor mayor que 0.");
        } else {
            System.out.println("Cociente: " + calcularCociente(dividendo, divisor));
        }
    }
}
