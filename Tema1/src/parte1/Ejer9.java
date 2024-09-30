package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// Variable donde almacenar la edad
		int age;
		
		// Variable que me indica si es mayor de edad
		boolean over18;
		
		// Scanner para leer de consola
		Scanner reader = new Scanner(System.in);
		
		// Solicitar una edad
		System.out.println("Introduzca su edad");
		
		// Leer la edad
		age = reader.nextInt();
		
		// Inidcar si es mayor o menor de edad con un booleano
		over18 = (age >= 18);
		
		System.out.println(over18);
	}

}
