package boletin4.bidimensional;

public class Ejercicio04 {
	public static void main(String[] args) {
		int tabla[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		boolean magica = esMagicav1(tabla);
		System.out.println(magica);
		magica = esMagicav2(tabla);
		System.out.println(magica);
	}

	// esMagica con for
	static boolean esMagicav1(int tabla[][]) {
		boolean magica = true;
		int suma = 0;
		int sumaTotal;

		for (int j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}

		// Recorro por filas desde la fila 1
		for (int i = 1; i < tabla.length; i++) {
			// Inicializo a 0 la variable que almacena la suma de las filas
			sumaTotal = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaTotal += tabla[i][j];
			} // He terminado de recorrer una fila
				// Compruebo si la suma de la fila es != de suma
			if (suma != sumaTotal) {
				magica = false;
			}
		}

		// Recorro la tabla por columnas
		for (int j = 0; j < tabla[0].length; j++) {
			sumaTotal = 0;

			// For para recorrer la columna j
			for (int i = 0; i < tabla.length; i++) {
				sumaTotal += tabla[i][j];
			} // Termino de recorrer la columna
				// Compruebo si la suma de la columna es distinto de suma
			if (suma != sumaTotal) {
				magica = false;
			}

		}

		return magica;
	}

	// Es magica con while
	static boolean esMagicav2(int tabla[][]) {
		// Variable que va a indicar si la matriz es mágica o no
		// Es la variable que se retornará en la función
		boolean magica = true;

		// Variable donde almacenar la suma de la primera fila
		int suma = 0;

		// Variable donde ir almacenando la suma de cada fila y de cada columna.
		int sumaTotal;

		// Inicializamos la i a 1 porque empezamos a recorrer desde la segunda fila
		// (i=1)
		int i = 1;
		
		// Variable para guardar el valor de la columna
		int j;

		for (j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}

		// Recorro por filas desde la fila 1
		while (i < tabla.length && magica) {
			// Inicializo a 0 la variable que almacena la suma de las filas
			sumaTotal = 0;
			for (j = 0; j < tabla[i].length; j++) {
				sumaTotal += tabla[i][j];
			} // He terminado de recorrer una fila
				// Compruebo si la suma de la fila es != de suma
			if (suma != sumaTotal) {
				magica = false;
			}

			// Incremento la i para avanzar a la siguiente fila
			i++;
		}

		// Inicializo de nuevo la j a 0
		j = 0;

		// Recorro la tabla por columnas
		while (j < tabla[0].length && magica) {
			sumaTotal = 0;

			// For para recorrer la columna j
			for (i = 0; i < tabla.length; i++) {
				sumaTotal += tabla[i][j];
			} // Termino de recorrer la columna
				// Compruebo si la suma de la columna es distinto de suma
			if (suma != sumaTotal) {
				magica = false;
			}
			// Incremento la j para avanzar a la siguiente columna
			j++;
		}

		// Devolvemos el valor de magica
		return magica;
	}

}
