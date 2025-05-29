package busqueda;

import static busqueda.BusquedaTesoro.*;

import java.util.Scanner;

public class PrincipalTesoro {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int filas;
		int columnas;
		int numObstaculos = 0;
		String movimiento;
		int res;

		System.out.println("BIENVENIDO A LA BÚSQUEDA DEL TESORO");

		do {
			// Seguimos pidiendo filas mientras el valor introducido sea inferior a 2
			System.out.println("Introduzca el número de filas del tablero. Mínimo 2:");
			filas = reader.nextInt();
		} while (filas < 2);

		do {
			// Seguimos pidiendo columnas mientras el valor introducido sea inferior a 2
			System.out.println("Introduzca el número de filas del tablero. Mínimo 2:");
			columnas = reader.nextInt();
		} while (columnas < 2);

		// Limpiamos buffer por si acaso
		reader.nextLine();

		// Creamos tablero
		inicializaTablero(filas, columnas);
		
		// Generamos posición del tesoro
		generaPosicionTesoro();

		// Calculamos el número de obstáculos que tendrá nuestro juego
		numObstaculos = (int) Math.sqrt(filas * columnas) / 2;

		// Colocamos los obstáculos en el tablero
		generaObstaculos(numObstaculos);

		// Calculamos la posición del jugador
		generaPosicionJugador();

		

		// El jugador se va a estar moviendo hasta que encuentre el tesoro, por lo que
		// las siguientes instrucciones deben ir en un bucle
		do {
			// Pintamos el tablero para saber cómo queda
			pintaTablero();
			
			// Comenzamos preguntando al jugador hacia dónde se quiere mover.
			System.out.println("¿Hacia dónde te quieres mover? ARRIBA, ABAJO, IZQUIERDA, DERECHA");
			movimiento = reader.next();

			// Movemos al jugador y recogemos el resultado del movimiento
			res = mueveJugador(movimiento);
			if (res == -1) {
				System.out.println("Movimiento no permitido: fuera del tablero u obstáculo");
			} else if (res == -2) {
				System.out.println("No entiendo el movimiento");
			}
		} while (tablero[posI][posJ] != 'X');

		System.out.println("¡ENCONTRASTE EL TESORO!");
		pintaTablero();
		reader.close();
	}

}
