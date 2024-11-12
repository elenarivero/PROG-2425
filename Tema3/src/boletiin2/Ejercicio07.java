package boletiin2;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		int[] tabla = new int[55];
		int inicio = 0;
		
		for(int i=1; i<=10; i++) {
			Arrays.fill(tabla, inicio, inicio+i, i);
			inicio += i;
		}
		
		
		System.out.println(Arrays.toString(tabla));

	}

}
