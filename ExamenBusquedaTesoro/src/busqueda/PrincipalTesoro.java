package busqueda;

import java.util.Arrays;
import static busqueda.BusquedaTesoro.*;

public class PrincipalTesoro {

	public static void main(String[] args) {
		inicializaTablero(3, 5);
		generaPosicionTesoro();
		generaObstaculos(2);
		generaPosicionJugador();
		System.out.println("(" + posI + ", " + posJ + ")");
		System.out.println(Arrays.deepToString(tablero));
	}

}
