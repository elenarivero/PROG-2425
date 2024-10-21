package english;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		double altMin = Double.MAX_VALUE;
		double altMax = Double.MIN_VALUE;

		double altura;

		Scanner reader = new Scanner(System.in);

		System.out.println("Introduzca una altura");
		altura = reader.nextDouble();
//		altMin = altura;
//		altMax = altura;
		
		while (altura != 0) {
			
			if(altura < altMin) {
				altMin = altura;
			} 
			if (altura > altMax) {
				altMax = altura;
			}
			
			System.out.println("Introduzca una altura");
			altura = reader.nextDouble();
		}
		
		System.out.println("Máxima: " + altMax);
		System.out.println("Mínima: " + altMin);
		reader.close();

	}

}
