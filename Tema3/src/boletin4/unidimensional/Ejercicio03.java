package boletin4.unidimensional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud = leeEnteroPositivo("longitud");

		int fin = leeEnteroPositivo("fin");
		
		System.out.println(longitud);
		System.out.println(fin);
		
		reader.close();

	}

	static int leeEnteroPositivo(String dato) {
		int numero = -1;

		do {
			try {
				System.out.println("Introduzca " + dato);
				numero = reader.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un entero");
			} finally {
				reader.nextLine();
			}
		} while (numero < 0);

		return numero;
	}

}
