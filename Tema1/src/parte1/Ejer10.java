package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		int number;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Dime un número");
		number = reader.nextInt();
		
		System.out.println(number%2==0 ? "El número es par" :"El número es impar" );

		reader.close();
	}

}
