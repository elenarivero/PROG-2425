package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		int sumaElectrodomesticos = 0;
		int sumaLavadoras = 0;
		int sumaTelevisiones = 0;

		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

		Electrodomestico e1 = new Lavadora(100);
		e1.calculaPrecio();
		
		electrodomesticos.add(new Lavadora(1000));
		electrodomesticos.add(new Television(20));
		electrodomesticos.add(new Lavadora(200));

		for (Electrodomestico e : electrodomesticos) {

			sumaElectrodomesticos += e.getPrecio();
			
			if (e instanceof Television) {
				sumaTelevisiones += e.getPrecio();
			} else if (e instanceof Lavadora) {
				sumaLavadoras += e.getPrecio();
			}
		}
	}

}
