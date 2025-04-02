package comparators.ejercicio01;

import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[20];
		
		Random rand = new Random();
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 101);
		}

		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros, new OrdenInversoNumeros());
		System.out.println(Arrays.toString(numeros));
		
	}

}
