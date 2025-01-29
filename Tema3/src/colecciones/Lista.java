package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros1 = new ArrayList();
		ArrayList<Integer> listaNumeros2 = listaNumeros1;
		listaNumeros1.add(2); //0
		listaNumeros1.add(3); //1
		listaNumeros1.add(4); //2
		
		listaNumeros1.remove(1);
		System.out.println(listaNumeros1);
		
		// Clonar una lista en otra
		List<Integer> listaCopia = (List<Integer>) listaNumeros1.clone();
		System.out.println("Lista copia: " + listaCopia);
		
		listaNumeros1.add(1, 8);
		listaNumeros1.addAll(1, listaNumeros2);
		
		for(int i=0; i<listaNumeros1.size(); i++) {
			System.out.println(listaNumeros1.get(i));
		}
		
		for(int numero : listaNumeros1) {
			System.out.println(numero);
		}
		
		
		ArrayList<Double> listaDecimales = new ArrayList<Double>();
		
		ArrayList<Boolean> listaBoolean = new ArrayList<Boolean>();
		
		ArrayList<String> listaCadenas = new ArrayList<String>();
		
		ArrayList<Character> listaCaracteres = new ArrayList<Character>();
		
		ArrayList<ArrayList<Integer>> dosDimensiones = new ArrayList<ArrayList<Integer>>();

		
		dosDimensiones.add(listaNumeros1);
		
		System.out.println(dosDimensiones);
	}

}
