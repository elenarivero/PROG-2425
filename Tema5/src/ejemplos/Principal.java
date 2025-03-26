package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import paquete2.Empleado;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		Persona p1 = new Empleado("21111111H", "Paco", 20, 1000);
		Persona p2 = new Empleado("11111111H", "Paco", 20, 1000);
		Persona p3 = new Empleado("41111111H", "Paco", 20, 1000);
		Persona p4 = new Empleado("31111111H", "Paco", 20, 1000);
		p4.dormir();
//		p1.antiguedad();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		Collections.sort(lista);
		System.out.println(lista);
		
	}

}
