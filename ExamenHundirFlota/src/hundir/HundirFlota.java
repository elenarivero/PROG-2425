package hundir;

import java.util.Scanner;

public class HundirFlota {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] tablero = new char[4][4];
		char[][] tableroJugador = new char[4][4];
		turnoJugador(tablero, tableroJugador);
	}

	static boolean turnoJugador(char tablero[][], char tableroJugador[][]) {
		boolean res = false;
		char fila;
		int columna;
		int pos;

		do {
			System.out.println("Introduzca una fila como letra:");
			fila = reader.next().toUpperCase().charAt(0);
			pos = (fila - 'A');
		} while (pos < 0 || pos >= tablero.length);

		do {
			System.out.println("Introduzca una columna como número:");
			columna = reader.nextInt();
		} while (columna < 0 || columna >= tablero.length);

		return res;
	}

}
