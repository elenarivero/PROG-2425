package arrays;

import java.util.Scanner;

public class ArrayLetras {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] tabla = {7,3,5,8,0,2,5};
		
		char letraA = 'A';
		char letra;
		
		for(int i=0; i<tabla.length; i++) {
			letra = (char) (letraA+i);
			System.out.print(letra + "\t");
		}
		
		System.out.println();
		for(int i=0; i<tabla.length; i++) {
			System.out.print(tabla[i] + "\t");
		}
		
		System.out.println();
		System.out.println("Introduzca una posición en letra");
		letra = reader.next().toUpperCase().charAt(0);
		
		System.out.println(letra - letraA);
		System.out.println(tabla[letra - letraA]);
		
		reader.close();
	}
}
