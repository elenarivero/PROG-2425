package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num1;
		int num2;
		
		// Pedir dos números al usuario
		System.out.println("Introduzca un número:");
		num1 = reader.nextInt();
		
		System.out.println("Introduzca un segundo número:");
		num2 = reader.nextInt();
		
		// Mostrar todas las operaciones en líneas distintas
		System.out.println("La suma es: " + (num1 + num2));
		System.out.println("La resta es: " + (num1 - num2));
		System.out.println("La multiplicación es: " + num1 * num2);
		System.out.println("La división es: " +  num1 / (double) num2);
	}

}
