package funciones;

import java.util.Arrays;

public class EjemploTabla {

	public static void main(String[] args) {
		int tabla[] = new int[5];
		
		int tablaEjemplo[] = modificaTabla(tabla);
		
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tablaEjemplo));
		
	}

	static int[] modificaTabla(int[] tabla) {
		int tabla2[] = {2,3,4,5,6,7};
		
		tabla[4] = 8;
		
		return tabla2;
	}
}
