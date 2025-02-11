package clases;

public class Principal {

	public static void main(String[] args) {
		Persona per1 = new Persona();
		
		per1.nombre = "Paco";
		per1.edad = 18;
		System.out.println(per1.nombre);
		
		Persona per2 = per1;
		per2.nombre = "Pepe";
		System.out.println(per1.nombre);
		
		System.out.println(Persona.hoy);
		Persona.hoyEs(2);
		System.out.println(Persona.hoy);
	}

}
