package colecciones.boletin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio06 {

	public static void main(String[] args) {
		Map<String, List<Integer>> agenda = new HashMap<>();
		
		String nombre = "Elena";
		
		int telefono = 698745236;
		
		List<Integer> telefonos = agenda.get(nombre);
		
		if(telefonos == null) {
			telefonos = new ArrayList<>(); 
		} 
		telefonos.add(telefono);
		agenda.put(nombre, telefonos);
 
		System.out.println(agenda);
		
		telefonos = agenda.get(nombre);
		
		if(telefonos == null) {
			telefonos = new ArrayList<>(); 
		} 
		telefonos.add(telefono);
		agenda.put(nombre, telefonos);
		
		System.out.println(agenda);
	}

}
