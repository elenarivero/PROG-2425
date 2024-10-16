package boletin4;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde almacenar los números que se piden al usuario
		int num;
		
		// Variable donde almacenar la suma
		int suma = 0;
		
		// Scanner para pedir números al usuario
		Scanner reader = new Scanner(System.in);
		
		// Le pido el número al usuario
		System.out.println("Introduzca un número:");
		num = reader.nextInt();
		
		// Mientras el número sea positivo sigo preguntando números
		while (num >= 0) {
			// Voy sumando los números
			suma += num;
			
			// Le pido el número al usuario
			System.out.println("Introduzca un número:");
			num = reader.nextInt();
			
		}
		
		// Muestro el resultado final
		System.out.println("La suma total es " + suma);
		
		// Cierre del scanner
		reader.close();
	}

}
