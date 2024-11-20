package boletin4.unidimensional;

import java.util.Arrays;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		int tabla[] = {1,2,3,4,3,2,3,4,5,4,3,3,5,6};
		
		int tablaRes[] = buscarTodos(tabla, 4);
		
		System.out.println(Arrays.toString(tablaRes));
	}

	static int[] buscarTodos(int t[], int valor) {
		int tamanyo = numVeces(t,valor);
		int[] tabla = new int[tamanyo];
		int indice = 0;
		
		for(int i=0; i<t.length; i++) {
			if(t[i] == valor) {
				tabla[indice] = i;
				indice++;
			}
		}
		
		
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
