package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas2D {
	
	
	public static void main(String[] args) {
		char[][] tabla = new char[5][5];
		
		for(int i=0; i<tabla.length; i++) {
			Arrays.fill(tabla[i], '-');
		}
		
		System.out.println(Arrays.deepToString(tabla));
		
		posicionarMinas(tabla, 5);
		
		System.out.println(Arrays.deepToString(tabla));
	}
	static void posicionarMinas(char[][] tablero, int numMinas) {
		Random rand = new Random();
		int posFila;
		int posColumna;
		int cont = 0;
		
		while(cont<numMinas) {
			posFila=rand.nextInt(0,tablero.length);
			posColumna=rand.nextInt(0,tablero[posFila].length);
			
			if(tablero[posFila][posColumna] != '*') {
				tablero[posFila][posColumna] = '*';
				cont++;
			}
		}
	}

}
