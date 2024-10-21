package boletin4;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde almacenar la altura introducida por el usuario
		int altura;

		// Variable donde almacenar la altura máxima
		int altMaxima;

		// Scanner para leer las alturas
		Scanner reader = new Scanner(System.in);

		// Pedimos una altura al usuario
		System.out.println("Introduzca una altura");
		altura = reader.nextInt();
		altMaxima = altura;

		// Mientras la altura introducida no sea -1
		while (altura != -1) {
			// Comprobar si la nueva altura es mayor que altMaxima
			if (altura > altMaxima) {
				// Actualizamos al altura máxima
				altMaxima = altura;
			}

			// Pedimos una altura al usuario
			System.out.println("Introduzca una altura");
			altura = reader.nextInt();
		}

		// Imprimimos la altura máxima
		System.out.println(altMaxima != -1 ? "La altura máxima es " + altMaxima 
				: "No ha introducido ninguna altura");
		// Cerramos el scanner
		reader.close();

	}

}
