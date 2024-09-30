package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable donde almacenar el número
		int number;
		
		// 1º Pedimos un número al usuario
		System.out.println("Introduzca un número:");
		
		// 2º Leemos el número de consola
		number = reader.nextInt();
		
		// 3º Mostramos el número introducido por el usuario
		System.out.println("El número introducido es " + number);

		// Cerramos el Scanner
		reader.close();
		
	}

}
