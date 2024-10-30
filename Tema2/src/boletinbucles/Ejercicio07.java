package boletinbucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable donde almacenar el tamaño de la pirámide
		int number;
		
		// Scanner para leer el número
		Scanner reader = new Scanner(System.in);
		
		// Le pido el número al usuario
		System.out.println("Introduzca una número para pintar una pirámide:");
		number = reader.nextInt();
		
		// bucle para las filas
		for(int fila = 1; fila <= number; fila++) {
			// for que imprime ascendentemente
			for(int j=1; j<=fila; j++) {
				System.out.print(j);
			}
			
			// for que imprime descendentemente
			for(int j= fila-1; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// Cierre del Scanner
		reader.close();

	}

}
