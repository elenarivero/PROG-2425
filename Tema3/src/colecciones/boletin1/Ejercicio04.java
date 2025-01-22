package colecciones.boletin1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		Set<Integer> conjuntoNumeros = new TreeSet<>();

		Random rand = new Random();

		int numero;

		// Hasta que el tamaño no sea 20 seguimos añadiendo
		while (conjuntoNumeros.size() < 20) {
			numero = rand.nextInt(1, 100);
			// Como en el conjunto no se añaden repetidos, aunque el número ya esté no se va
			// a añadir
			conjuntoNumeros.add(numero);
		}

		System.out.println(conjuntoNumeros);

	}

}
