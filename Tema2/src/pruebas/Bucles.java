package pruebas;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		int num = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num = reader.nextInt();
		while (num >= 0) {
			System.out.println(num);
			
			System.out.println("Introduzca un número");
			num = reader.nextInt();
		}

		System.out.println("Fin del programa");
		reader.close();
	}

}
