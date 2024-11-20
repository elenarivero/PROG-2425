package boletin4.unidimensional;

public class Ejercicio04 {

	public static void main(String[] args) {
		int[] tablaPrueba = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int indice = 0;
		int[][] tabla = rellenar(4, 5);
		
		indice = buscar(tablaPrueba, 2);

		System.out.println(indice);
	}

	static int[][] rellenar (int filas, int columnas) {
		int t[][] = new int[filas][columnas];
		
		return t;
	}
	
	
	static int buscar(int[] tabla, int valor) {
		// Variable donde almacenar el índice
		int indice = 0;

		// Variable booelana para controlar si ha encontrado el elemento
		boolean enc = false;

		// Mientras no lleguemos al final de la tabla y no lo encontramos seguimos
		// buscando
		while (indice < tabla.length && !enc) {
			// Si el valor está en el índice actual actualizo enc a true
			if (tabla[indice] == valor) {
				enc = true;
			} else {
				// si no está en la posición en la que estoy incremento en 1 el índice
				indice++;
			}
		}

		if (!enc) {
			// Si no lo he encontrado tengo que devolver -1
			indice = -1;
		}

		// Devolvemos el índice
		return indice;
	}
}
