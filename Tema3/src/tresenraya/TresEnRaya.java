package tresenraya;

import java.util.Arrays;

public class TresEnRaya {

	static char[][] tablero = {{'O', 'X', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};
	
	/**
	 * Inicializamos el tablero a guión medio (-)
	 */
	public static void inicializaTablero() {
		for(char[] fila : tablero) {
			Arrays.fill(fila, '-');
		}
	}

	public static boolean winner(char jugador) {
		boolean res = false;
		boolean auxRes = true;
		int i = 0;
		int j = 0;
		
		while(i<tablero.length && !res) {
			j = 0;
			while(j<tablero[i].length && auxRes) {
				if(tablero[i][j] != jugador) {
					auxRes = false;
				}
				j++;
			}
			res = auxRes;
			auxRes = true;
			i++;
		}
		
		j = 0;
		
		while(j<tablero[0].length && !res) {
			i = 0;
			
			while(i<tablero.length && auxRes) {
				if(tablero[i][j] != jugador) {
					auxRes = false;
				}
				
				i++;
			}
			
			res = auxRes;
			auxRes = true;
			j++;
		}
		
		i = 0;
		
		if(!res) {
			while(i<tablero.length && auxRes) {
				if(tablero[i][i] != jugador) {
					auxRes = false;
				}
				i++;
			}
			
			res = auxRes;
		}
		
		if(!res) {
			auxRes = true;
			while(i<tablero.length && auxRes) {
				if(tablero[i][tablero.length-i-1] != jugador) {
					auxRes = false;
				}
				i++;
			}
			
			res = auxRes;
		}
		
		return res;
	}
}
