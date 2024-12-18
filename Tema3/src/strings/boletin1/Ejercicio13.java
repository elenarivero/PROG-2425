package strings.boletin1;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		String cadena1 = "roma";
		String cadena2 = "amar";

		boolean res = anagramas(cadena1, cadena2);
		
		System.out.println(res);
	}

	static boolean anagramas(String cad1, String cad2) {
		boolean esAnagrama = false;
		
		char[] array1 = cad1.toCharArray();
		char[] array2 = cad2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
			
		
		return esAnagrama = (Arrays.equals(array1, array2));
	}
	
}
