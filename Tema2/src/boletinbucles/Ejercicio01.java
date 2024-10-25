package boletinbucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde almacenar las horas
		int horas;

		// Variable donde almacenar los minutos
		int mins;

		// Variable donde almacenar los segundos
		int secs;

		// Variable donde almacenar los segundos a incrementar
		int incSecs;
		
		// Booleana para controlar los errores al introducir datos
		boolean error = false;

		// Scanner para leer datos
		Scanner reader = new Scanner(System.in);
		
		do {
			try {
				// Pedimos horas, minutos y segundos al usuario
				System.out.println("Introduzca las horas:");
				horas = reader.nextInt();
				assert (horas>=0 && horas<=23) : "El valor de las horas debe estar entre 0 y 23";
				error = false;
			} catch(AssertionError e) {
				System.out.println(e.getMessage());
				error = true;
			}
		} while (error);
		
		// Pedimos horas, minutos y segundos al usuario
		System.out.println("Introduzca los minutos:");
		mins = reader.nextInt();
		assert (mins>=0 && mins<=59) : "El valor de los minutos debe estar entre 0 y 59";
		
		// Cierre del scanner
		reader.close();

	}

}
