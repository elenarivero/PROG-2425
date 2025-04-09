package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		
		try {
			Persona p1 = new Empleado("21111111H", "Paco", 20, -1000);
		} catch (SalarioNegativoException e) {
			System.out.println(e.getMessage());
		} 
		
//		Persona p2 = new Empleado("11111111H", "Elena", 20, 1000);
//		Persona p3 = new Empleado("41111111H", "María", 20, 1000);
//		Persona p4 = new Empleado("31111111H", "Francisco", 20, 1000);
		
		
		ComparaNombres cn = new ComparaNombres();
		
//		System.out.println(cn.compare(p3, p4));
//		p4.dormir();
////		p1.antiguedad();
//		
//		lista.add(p1);
//		lista.add(p2);
//		lista.add(p3);
//		lista.add(p4);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		
		lista.sort(new ComparaNombres());
		System.out.println(lista);
		
	}

}
