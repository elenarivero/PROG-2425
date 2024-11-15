package boletin3;

import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		Random rand = new Random();

		int tabla[][] = new int[4][5];

		int suma = 0;
		int sumaTotal = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(100, 1000);
			}
		}

		for (int i = 0; i < tabla.length; i++) {
			suma = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
				suma += tabla[i][j];
			}
			System.out.println(suma);
		}

		for (int j = 0; j < tabla[0].length; j++) {
			suma = 0;
			for (int i = 0; i < tabla.length; i++) {
				suma += tabla[i][j];
			}
			sumaTotal += suma;
			System.out.print(suma + "\t");
		}
		
		System.out.println(sumaTotal);
	}

}
