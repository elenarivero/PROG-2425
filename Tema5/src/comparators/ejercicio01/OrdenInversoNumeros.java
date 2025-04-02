package comparators.ejercicio01;

import java.util.Comparator;

public class OrdenInversoNumeros implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}

}
