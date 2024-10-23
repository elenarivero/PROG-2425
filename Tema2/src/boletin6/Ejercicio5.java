package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable donde almacenar el factorial
		long factorial = 1;
		
		// Variable donde almacenar el número introducido por el usuario
		int num;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos un número al usuario
		System.out.println("Introduzca un valor entero positivo");
		num = reader.nextInt();
		
		// LLegamos hasta 2 porque el 1 no aporta a la multiplicación 
		for(int i = num; i>=2; i--) {
			// Vamos imprimiendo por consola la operación
			System.out.print(i + " x ");
			factorial *= i;
		}
		
		// Imprimimos el 1 que falta en la expresión y el resultado
		System.out.println("1 = " + factorial);
		
		// Cerramos el Scanner
		reader.close();
		
		

	}

}
