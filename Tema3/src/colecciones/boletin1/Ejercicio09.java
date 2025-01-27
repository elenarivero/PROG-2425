package colecciones.boletin1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Scanner para leer de consola
		Scanner reader = new Scanner(System.in);

		// Variable que se va a corresponder con la clave a almacenar
		int numero;

		// Variable donde se va a almacenar el valor del mapa
		Integer valor;

		// Variable para almacenar la respuesta del usuario sobre si quiere volver a
		// introducir números
		String repetir;

		// Mapa donde almacenar los números del Euromillón
		TreeMap<Integer, Integer> numeros = new TreeMap<>();

		// Mapa donde almacenar las estrellas del Euromillón
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		
		// While que se repetirá mientras el usuario quiere seguir introduciendo
		// apuestas
		do {
			// Pedimos 5 números
			System.out.println("Introduzca 5 números:");			
			for (int i = 1; i <= 5; i++) {
				numero = reader.nextInt();
				addNumber(numero, numeros);
			}

			// Pedimos 2 estrellas
			System.out.println("Introduzca 2 estrellas:");
			for (int i = 1; i <= 2; i++) {
				numero = reader.nextInt();
				addNumber(numero, estrellas);
			}

			System.out.println("Conteo actual: ");
			System.out.println(numeros);
			System.out.println(estrellas);

			System.out.println("¿Quiere introducir otra apuesta?");
			repetir = reader.next();
		} while (repetir.equals("si"));

		reader.close();
	}

	static void addNumber(int number, Map<Integer, Integer> mapa) {
		// Comprobamos si la estrella ya está
		Integer valor = mapa.get(number);
		if (valor == null) {
			// Si la estrella no está almacenada se añade con valor=1
			mapa.put(number, 1);
		} else {
			// Incrementamos el valor
			valor++;
			// Se actualiza el valor de la estrella
			mapa.put(number, valor);
		}
	}
}
