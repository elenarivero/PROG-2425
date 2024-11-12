package arrays;

import java.util.Arrays;

public class Bidimensionales {

	public static void main(String[] args) {
		int[][] tabla = new int[3][4];
		
		
		System.out.println(tabla.length);
		System.out.println(Arrays.deepToString(tabla));
		
		for(int fila = 0; fila<tabla.length; fila++) {
			for(int col = 0; col<tabla[fila].length; col++) {
				System.out.print(tabla[fila][col] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int fila = 0; fila<tabla.length; fila++) {
			for(int valor : tabla[fila])
				System.out.print(valor + " ");
			
			System.out.println();
		}

		System.out.println();
		
		for(int[] fila: tabla) {
			for(int valor: fila)
				System.out.print(valor + " ");
			
			System.out.println();
		}
	}

}
