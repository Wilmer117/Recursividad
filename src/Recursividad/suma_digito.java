package Recursividad;

import java.util.Scanner;

public class suma_digito {

    public static int sumarDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }

        return numero % 10 + sumarDigitos(numero / 10);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        System.out.println("Suma de los digitos: " + sumarDigitos(Math.abs(numero)));
    }
}
