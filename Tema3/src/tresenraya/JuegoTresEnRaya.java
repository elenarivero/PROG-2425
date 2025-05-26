package tresenraya;

import java.util.Arrays;

public class JuegoTresEnRaya {

	public static void main(String[] args) {
		//TresEnRaya.inicializaTablero();
		
		System.out.println(Arrays.deepToString(TresEnRaya.tablero));
		System.out.println(TresEnRaya.winner('X'));
	

	}

}
