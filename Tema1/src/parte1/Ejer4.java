package parte1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Nota 1
		int nota1;
		
		// Nota 2
		int nota2;
		
		// Variable para calcular la media
		double media;
		
		// Scanner para leer de consola
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca la nota 1");
		nota1 = reader.nextInt();
		
		System.out.println("Introduzca la nota 2");
		nota2 = reader.nextInt();
		
		media = (double) (nota1+nota2)/2;
		
		System.out.println("La media es " + media);
				
	}
}
