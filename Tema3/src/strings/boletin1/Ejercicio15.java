package strings.boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
		
	public static void main(String[] args) {
		// Frase introducida por el usuario
		String fraseUsuario;

		// Frase desordenada
		String fraseDesordana;

		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);

		// Pedimos una frase al usuario
		System.out.println("Introduzca una frase:");
		fraseUsuario = reader.nextLine();

		fraseDesordana = desordenaTexto(fraseUsuario);

		System.out.println(fraseDesordana);

	}

	static String desordenaTexto(String frase) {
		String res = "";

		// Transformo la cadena en tabla
		char[] fraseTabla = frase.toCharArray();

		// Un carácter auxiliar para hacer el intercambio
		char aux;

		// Random para generar valores aleatorios
		Random rand = new Random();

		// Entero para la posición aleatoria
		int posAleatoria;

		// Recorremos la tabla de inicio a fin
		for (int i = 0; i < fraseTabla.length; i++) {
			posAleatoria = rand.nextInt(0, fraseTabla.length);

			// Intercambio valores en la tabla
			aux = fraseTabla[i];
			fraseTabla[i] = fraseTabla[posAleatoria];
			fraseTabla[posAleatoria] = aux;
		}

		// Transformamos la tabla en String
		res = String.valueOf(fraseTabla);
		return res;

	}
}
