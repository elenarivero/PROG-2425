package boletin3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int filas;

		int columnas;

		int[][] tabla;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca las filas");
		filas = reader.nextInt();

		System.out.println("Introduzca las columnas");
		columnas = reader.nextInt();

		tabla = new int[filas][columnas];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}

		for (int[] fila : tabla) {
			for (int col : fila) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}

		reader.close();

	}

}
