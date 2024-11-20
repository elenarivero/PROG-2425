package boletin4;

public class Ejercicio05 {

	static int[] buscarTodos(int t[], int valor) {
		int tamanyo = numVeces(t,valor);
		int[] tabla = new int[tamanyo];
		
		
		
		return tabla;
	}
	
	static int numVeces(int t[], int valor) {
		int cont = 0;
		
		for(int contenido : t) {
			if(contenido == valor) {
				cont++;
			}
		}
		
		return cont;
	}
}
