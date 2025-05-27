package busqueda;

import java.util.Arrays;
import static busqueda.BusquedaTesoro.*;

public class PrincipalTesoro {

	public static void main(String[] args) {
		inicializaTablero(4, 5);
		generaPosicionTesoro();
		generaObstaculos(2);
		generaPosicionJugador();
		pintaTablero();
	}

}
