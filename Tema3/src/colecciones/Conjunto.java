package colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {
		HashSet<Integer> conjunto1 = new HashSet<Integer>();
		LinkedHashSet<Integer> conjunto2 = new LinkedHashSet<Integer>();
		TreeSet<Integer> conjunto3 = new TreeSet<Integer>();
		
		conjunto1.add(2);
		conjunto1.add(5);
		conjunto1.add(1);
		System.out.println(conjunto1.add(8));
		System.out.println(conjunto1.add(5));
		
		System.out.println("Conjunto 1: " + conjunto1);
		
		conjunto2.add(2);
		conjunto2.add(5);
		conjunto2.add(1);
		conjunto2.add(8);
		
		System.out.println("Conjunto 2: " + conjunto2);
		
		conjunto3.add(2);
		conjunto3.add(5);
		conjunto3.add(1);
		conjunto3.add(8);
		
		for(int numero: conjunto1) {
			System.out.println(numero);
		}
		System.out.println("Conjunto 3: " + conjunto3);
		
		System.out.println(conjunto1.equals(conjunto2));
		Object[] array = conjunto2.toArray();
		
		System.out.println(Arrays.toString(array));
	}

}
