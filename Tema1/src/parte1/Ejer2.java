package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Variable donde almacenar la edad
		int age;
		
		// Scanner para leer de consola
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la edad al usuario
		System.out.println("Introduzca su edad");
		age = reader.nextInt();
		
		// Le decimos cuántos años tendrá el año que viene
		System.out.println("El año que viene tendrás " + ++age + " años");
		
		reader.close();
	}

}
