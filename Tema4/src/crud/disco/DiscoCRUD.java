package crud.disco;

import java.util.HashSet;
import java.util.Set;

public class DiscoCRUD {

	private static Set<Disco> listaDiscos = new HashSet<>();
	
	public static boolean añadeDisco(Disco d) {
		return listaDiscos.add(d);
	}
	
	public static void pintaLista() {
		System.out.println(listaDiscos);
	}
	
	public static boolean eliminaDisco(Disco disco) {
		boolean res = false;
		boolean enc = false;
		int i = 0;
		//Disco disco;
		
//		while (i<listaDiscos.size() && !enc) {
//			disco = listaDiscos.get(i);
//			if(disco.getCodigo() == codigo) {
//				listaDiscos.remove(i);
//				enc = true;
//			}
//			i++;
//		}
		
		res = listaDiscos.remove(disco);
		
		return res;
	}
}
