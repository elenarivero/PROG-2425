package boletin5;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner reader = new Scanner(System.in);
		String opc;
		
		do {
			System.out.println("Introduzca una opción:");
			opc = reader.next();

			switch (opc.toUpperCase()) {
			case "A":
				System.out.println("suma");
				break;
			case "B":
				System.out.println("resta");
				break;
			case "C":
				System.out.println("multiplicación");
				break;
			case "D":
				System.out.println("división");
				break;
			case "E":
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!opc.equals("E"));

		reader.close();


	}

}
