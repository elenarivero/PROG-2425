package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable donde almacena el número 1
		int number1;
		
		// Variable donde almacena el número 2
		int number2;
		
		// Variable donde almacena el número 3
		int number3;

		// Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);
		
		// Pido el primer número
		System.out.println("Introduzca el número 1:");
		number1 = reader.nextInt();
		
		// Pido el segundo número
		System.out.println("Introduzca el número 2:");
		number2 = reader.nextInt();
		
		// Pido el tercer número
		System.out.println("Introduzca el número 3:");
		number3 = reader.nextInt();
		
		// n1 >= n2 >= n3
		if(number1 >= number2 && number2 >= number3) {
			System.out.println(number1 + " " + number2 + " " + number3);
		} else if (number1 >= number3 && number3 >= number2) { // n1 >= n3 >= n2
			System.out.println(number1 + " " + number3 + " " + number2);
		} else if (number2 >= number1 && number1 >= number3) { // n2 >= n1 >= n3
			System.out.println(number2 + " " + number1 + " " + number3);
		} else if (number2 >= number3 && number3 >= number1) { // n2 >= n3 >= n1
			System.out.println(number2 + " " + number3 + " " + number1);
		} else if (number3 >= number1 && number1 >= number2) { // n3 >= n1 >= n2
			System.out.println(number3 + " " + number1 + " " + number2);
		} else { // n3 >= n2 >= n1
			System.out.println(number3 + " " + number2 + " " + number1);
		}
		
		reader.close();
	}

}
