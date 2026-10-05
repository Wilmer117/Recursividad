package Recursividad;

import java.util.Scanner;

public class sumatoria_fracciones {

    public static double calcularSumatoria(int numero) {
        if (numero <= 0) {
            return 0;
        }
        return (1.0 / numero) + calcularSumatoria(numero - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("Sumatoria: " + calcularSumatoria(numero));
    }
}
