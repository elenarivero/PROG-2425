package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02 {
	public static void main(String[] args) {
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		desordenaTabla(tabla);

		System.out.println(Arrays.toString(tabla));
	}

	static void desordenaTabla(int[] tabla) {
		// Objeto para generar números aleatorios
		Random rand = new Random();

		// Posición aleatoria de la tabla
		int posI;

		// Variable auxiliar para hacer el intercambio de valores
		int aux;

		// Recorremos la tabla para intercambiar valores
		for (int i = 0; i < tabla.length; i++) {
			// Genero posición aleatorio de la tabla con la que intercambiar valores
			posI = rand.nextInt(0, tabla.length);

			// Almaceno en aux el valor de la posición i
			aux = tabla[i];

			// Machaco la posición i con el valor almacenado en la posición aleatoria
			tabla[i] = tabla[posI];

			// En la posición aleatoria almaceno el valor de la auxiliar, que tiene
			// almacenado el valor inicial de i
			tabla[posI] = aux;
		}
	}
}
