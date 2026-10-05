package Recursividad;

import java.util.Scanner;

public class suma_vector {

    public static int sumarVector(int[] vector, int posicion) {
        if (posicion == vector.length) {
            return 0;
        }

        return vector[posicion] + sumarVector(vector, posicion + 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos valores desea ingresar: ");
        int cantidad = entrada.nextInt();

        int[] vector = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = entrada.nextInt();
        }

        System.out.println("Suma de los elementos: " + sumarVector(vector, 0));
    }
}
