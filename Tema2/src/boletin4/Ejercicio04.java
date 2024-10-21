package boletin4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable donde almacenar la suma de los números positivos
		int sumaPositivos = 0;

		// Contador de números negativos
		int contNegativos = 0;

		// Suma de números negativos
		int sumNegativos = 0;

		// Contador para el número de ceros
		int contCeros = 0;

		// Contador para que repita el while 10 veces
		int cont = 1;

		// Variable donde almacenar el valor introducido por el usuario
		int num;

		// Scanner para leer los números
		Scanner reader = new Scanner(System.in);

		// Seguiremos pidiendo números mientras el contador sea menor o igual que 10
		while (cont <= 10) {
			// Le pedimos un número al usuario
			System.out.println("Introduzca un número:");
			num = reader.nextInt();

			// Si el número es positivo
			if (num > 0) {
				// Lo añadimos a los positivos
				sumaPositivos += num;
			} else if (num < 0) { // Si el número es negativo
				sumNegativos += num;
				contNegativos++;				
			} else { // Si el número es 0
				contCeros++;
			}

			cont++;
		}

		// Imprimimos la suma de los números positivos
		System.out.println("La suma de los números positivos es " + sumaPositivos);
		
		// Imprimimos la media de los números negativos
		System.out.println(contNegativos == 0 ? "No se ha introducido ningún número negativo"
				: "La media es " + (double) sumNegativos / contNegativos);			
		
		// Imprimimos la cantidad de ceros
		System.out.println("La cantidad de ceros introducidos es " + contCeros);
		
		// Cerramos el Scanner
		reader.close();

	}

}
