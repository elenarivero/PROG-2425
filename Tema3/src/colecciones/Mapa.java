package colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapa {

	public static void main(String[] args) {
		HashMap<Integer, String> conjunto1 = new HashMap<Integer, String>();
		LinkedHashMap<String, Double> conjunto2 = new LinkedHashMap<String, Double>();
		TreeMap<Integer, Integer> conjunto3 = new TreeMap<Integer, Integer>();

		conjunto1.put(2, "Agua");
		conjunto1.put(3, "Fanta");
		conjunto1.put(2, "Coca-cola");
		
		System.out.println(conjunto1);
		
		
		Set<Map.Entry<Integer, String>> entradas = conjunto1.entrySet();
		
		for(Map.Entry<Integer, String> entrada : entradas) {
			System.out.println(entrada.getKey() + " " + entrada.getValue());
		}
		
		
		Set<Integer> claves = conjunto1.keySet();
		
		for(int clave : claves) {
			System.out.println(clave + " " + conjunto1.get(clave));
		}
		
	}

}
