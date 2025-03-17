package ejemplos;

import paquete2.Empleado;

public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("12345678Z", "Pepe", 18, 1000);
		Persona p1 = new Empleado("11111111H", "Paco", 20, 1000);
		Persona p2 = new Persona("987654321T", "Manolo", 28);
		String persona = "María";
		
		System.out.println(p2.getClass().getSuperclass());
		System.out.println();
		System.out.println(e1.getClass().getSuperclass());
		
		System.out.println(p1.equals(e1));
		
		if(p1 instanceof Empleado e2) {
			System.out.println(e2.getSalario());
		}
	}

}
