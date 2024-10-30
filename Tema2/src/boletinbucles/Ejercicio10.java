package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Número introducido por el usuario
		int numero = -1;

		// Variable donde ir almacenando las divisiones
		int division;

		// Variable donde guardar el número al revés
		int numReves = 0;

		// Variable donde almacenar la última cifra
		int ultimaCifra;

		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);

		do {
			try {
				// le pido un número al usuario
				System.out.println("Introduzca un número positivo:");
				numero = reader.nextInt();
				assert numero >= 0 : "Debe introducir un número mayor o igual que 0";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un número entero");
			} finally {
				reader.nextLine();
			}
		} while (numero < 0);

		division = numero;

		while (division > 0) {
			ultimaCifra = division % 10;
			numReves = numReves * 10 + ultimaCifra;
			division /= 10;
		}

		if(numReves == numero) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
		
		// Cierre del Scanner
		reader.close();

	}

}
