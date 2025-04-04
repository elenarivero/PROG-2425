package ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		int sumaElectrodomesticos = 0;
		int sumaLavadoras = 0;
		int sumaTelevisiones = 0;

		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

		try {
			Electrodomestico e = new Electrodomestico(-200) ;
		} catch (NegativePriceException e) {
			System.out.println(e);
		} catch (Exception e) {
			
		}finally {
			
		}
			
	}

}
