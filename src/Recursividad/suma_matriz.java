package Recursividad;

import java.util.Scanner;

public class suma_matriz {

    public static int sumarMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }

        if (columna == matriz[fila].length) {
            return sumarMatriz(matriz, fila + 1, 0);
        }

        return matriz[fila][columna] + sumarMatriz(matriz, fila, columna + 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Suma de los elementos: " + sumarMatriz(matriz, 0, 0));
    }
}
