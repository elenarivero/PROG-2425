package arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas2D {
	
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
