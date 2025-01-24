package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClaseCollections {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();
		List<String> cadenas = new ArrayList<String>();
		
		cadenas.add("Silla");
		cadenas.add("Sillas");
		
		System.out.println(Collections.min(cadenas));
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		
		for(int i=1; i<=10; i++) {
			lista2.add(i);
		}
		
		Collections.reverse(lista2);
		System.out.println(lista2);
		
		
		Collections.fill(lista, 1);
		Collections.copy(lista2, lista);
		
		Collections.shuffle(lista2);
		
		System.out.println(lista);
		System.out.println(lista2);

	}

}
