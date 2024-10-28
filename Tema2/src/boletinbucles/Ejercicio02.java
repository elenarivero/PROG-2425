package boletinbucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable donde almacenar el número límite
		int numLimite;

		// Variable divisor que va a ir recorriendo los divisores del número que estoy
		// comprobando
		int divisor = 2;
		
		// Variable boolean para saber si el número es primo o no
		boolean esPrimo;
		
		// Variable para contar los primos
		int cont = 0;

		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);

		// Pedimos el número límite
		System.out.println("Introduzca el número máximo:");
		numLimite = reader.nextInt();

		for (int num = 2; num <= numLimite; num++) {
			// Cada vez que comienzo con un número nuevo inicializo a true
			esPrimo = true;
			
			// Inicializamos el divisor a 2
			divisor = 2;
			while (divisor <= Math.sqrt(num) && esPrimo) {
				// Si el número es divisible por i entonces no es primo
				if (num % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}
			
			// Si el número en el que estamos es primo entonces contamos uno más
			if(esPrimo) {
				cont++;
			}
			
		}
		
		// Imprimimos la cantidad de primos
		System.out.println("Hay " + cont + " primos");

	}

}
