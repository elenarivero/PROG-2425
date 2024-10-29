package boletinbucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde almacenar el tamaño del triángulo
		int tamanyo;
		
		// Scanner para leer de consola
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos el tamaño al usuario
		tamanyo = reader.nextInt();
		
		// Si el tamaño es correcto
		if(tamanyo > 0) {
			
		} else {
			System.out.println("El tamaño introducido no es correcto.");
		}
		
		// Cerramos scanner
		reader.close();
	}

}
