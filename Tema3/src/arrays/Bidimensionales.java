package arrays;

import java.util.Arrays;

public class Bidimensionales {

	public static void main(String[] args) {
		int[][] tabla = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		
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
