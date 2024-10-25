package boletin6;

import java.util.Scanner;

public class Ejercicio7v1 {

	// Versión del número primo con break
	public static void main(String[] args) {
		// Variable donde almacenar el número del usuario
		int num;
		
		// Variable booelana para indicar si el número es primo o no
		// Se inicializa a true porque de inicio todos los números son primos
		// hasta que se demuestre lo contrario
		boolean esPrimo = true;
		
		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		num = reader.nextInt();
		
		// Comprobamos que el número es correcto
		if(num > 0) {
			// el número 1 no es primo
			if(num == 1) {
				esPrimo = false;
			} else {
				// Buscamos a ver si el número tiene algún divisor
				for(int i = 2; i<= Math.sqrt(num); i++) {
					// Si el número es divisible por i entonces no es primo
					if(num % i == 0) {
						esPrimo = false;
						// En cuanto encuentro un divisor me salgo del bucle
						break;
					}
				}
			}
			
			System.out.println("El número "+ (esPrimo ? "" : "no ") + "es primo");
		} else {
			System.out.println("El número no es correcto");
		}
		
		// Cierro scanner
		reader.close();
		
	}

}
