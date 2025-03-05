package crud.disco;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {

	private static HashSet<Disco> listaDiscos = new HashSet<>();
	
	public static boolean añadeDisco(Disco d) {
		return listaDiscos.add(d);
	}
	
	public static void pintaLista() {
		for(Disco disco : listaDiscos) {
			System.out.println(disco);
		}
	}
	
	private static Disco buscaDisco(Disco d) {
		Disco d2 = null;
		
		for(Disco dLista : listaDiscos) {
			if(d.equals(dLista)) {
				d2 = dLista;
			}
		}
		
		return d2;
	}
	
	public static boolean modificaAutor(Disco d, String autor) {
		boolean res = false;
		
		Disco dModificar = buscaDisco(d);
		
		if(dModificar != null) {
			dModificar.setAutor(autor);
			res = true;
		}
		
		return res;
	}
	
	public static boolean eliminaDisco(Disco disco) {
		return listaDiscos.remove(disco);
	}
}
