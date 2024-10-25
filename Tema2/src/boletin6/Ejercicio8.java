package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variable donde almacenar el número A
		int numA;
		
		// Variable donde almacenar el número B
		int numB;

		// Scanner para leer los números
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número A
		System.out.println("Introduzca el número A");
		numA = reader.nextInt();
		
		// Pedimos el número B
		System.out.println("Introduzca el número B");
		numB = reader.nextInt();
		
		// Si A es menor que B
		if(numA <= numB) {
			// Imprimimos de A a B
			for(int i=numA; i<=numB; i++) {
				System.out.print(i + " ");
			}
		} else { // Si B es menor que A
			// Imprimimos de B a A
			for(int i=numB; i<=numA; i++) {
				System.out.print(i + " ");
			}
		}
		
		// Cierre del Scanner
		reader.close();
	}

}
