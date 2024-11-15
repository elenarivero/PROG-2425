package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable para el mínimo
		double min;

		// Variable para el máximo
		double max;

		// Variable para la media
		double media;

		// Tabla donde almacenar las notas
		double notas[][] = new double[4][5];

		// Creamos el Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);

		// Bucle para pedir las notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduzca las notas del alumno " + (i + 1) + ":");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Introduzca la nota " + (j + 1) + ":");
				notas[i][j] = reader.nextDouble();
			}
		}

		// Imprimimos las notas en formato bonito
		System.out.print("\t");
		for (int i = 1; i <= 5; i++) {
			System.out.print("\tNota " + i);
		}
		System.out.print("\tMínimo");
		System.out.print("\tMáximo");
		System.out.println("\tMedia");

		for (int i = 0; i < notas.length; i++) {
			media = 0;
			min = notas[i][0];
			max = notas[i][0];
			System.out.print("Alumno " + (i + 1) + "\t");
			for (int j = 0; j < notas[i].length; j++) {
				media += notas[i][j];
				System.out.print(notas[i][j] + "\t");
				if (notas[i][j] < min) {
					min = notas[i][j];
				}
				if (notas[i][j] > max) {
					max = notas[i][j];
				}
			}
			
			media /= notas[i].length;
			System.out.println(min + "\t" + max + "\t" + media);
		}

		// System.out.println(Arrays.deepToString(notas));
	}

}
