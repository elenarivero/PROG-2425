package arrays;

import java.util.Scanner;

public class PruebasArrays {

	public static void main(String[] args) {
		int edades[] = new int[5];
		double alturas[] = new double[10];
		String cadenas[] = new String[4];
		boolean logicos[] = new boolean[8];
		int num;
		
		Scanner reader = new Scanner(System.in);
		
				
		for(int i=0; i<edades.length; i++) {
			System.out.println("Introduzca un número: ");
			num = reader.nextInt();
			edades[i] = num;
		}
		
		System.out.println();
		
		//for-each
		// for var in lista
		for(int valor : edades) {
			System.out.print(valor + " ");
		}
		
	}

}
