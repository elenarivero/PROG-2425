package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variable donde almacenar el número A
		int numA;

		// Variable donde almacenar el número B
		int numB;

		// Variables para indicar el mínimo y el máximo
		int min;
		int max;

		// Scanner para leer los números
		Scanner reader = new Scanner(System.in);

		// Pedimos el número A
		System.out.println("Introduzca el número A");
		numA = reader.nextInt();

		// Pedimos el número B
		System.out.println("Introduzca el número B");
		numB = reader.nextInt();

		// Si B es menor que A
		if (numA <= numB) {
			min = numA;
			max = numB;
		} else {
			min = numB;
			max = numA;
		}

		// Imprimimos de min a max
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

		// Cierre del Scanner
		reader.close();
	}

}
