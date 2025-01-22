package colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
		
		
	}

}
