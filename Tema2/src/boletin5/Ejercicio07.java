package boletin5;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable donde almacenar el número 1
		int num1;
		
		// Variable donde almacenar el número 2
		int num2;
		
		// Variable donde almacenar la opción introducida por el usuario
		String opc;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		do {
			// Pedimos dos números al usuario
			System.out.println("Introduzca dos números con los que hacer la operación");
			num1 = reader.nextInt();
			num2 = reader.nextInt();
			
			// Mostramos el menú
			System.out.println("Introduzca una opción:");
			System.out.println("A. SUMA");
			System.out.println("B. RESTA");
			System.out.println("C. MULTIPLICACIÓN");
			System.out.println("D. DIVISIÓN");
			System.out.println("E. SALIR");
			opc = reader.next();

			// Según la opción seleccionada haremos una operación u otra
			switch (opc.toUpperCase()) {
			case "A":
				System.out.println("La suma es " + (num1+num2));
				break;
			case "B":
				System.out.println("La resta es " + (num1 - num2));
				break;
			case "C":
				System.out.println("La multiplicación es " + (num1 * num2));
				break;
			case "D":
				if(num2 != 0) {
					System.out.println("La división es " + ((double) num1 / num2));
				} else {
					System.out.println("No se puede dividir por 0");
				}
				break;
			case "E":
				// Nos salimos del programa
				System.out.println("Fin del programa");
				break;
			default:
				// Opción no válida
				System.out.println("Opción no válida");
			}

		} while (!opc.equals("E"));

		// Cerramos el Scanner
		reader.close();

	}

}
