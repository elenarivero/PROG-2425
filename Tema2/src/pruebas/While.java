package pruebas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int num = 0;
		Scanner reader = new Scanner(System.in);

		while(num < 1 || num > 100) {
			System.out.println("Introduzca un número");
			num = reader.nextInt();
		} 
		
		System.out.println("Valor válido: " + num);

		System.out.println("Fin del programa");
		reader.close();

	}

}
