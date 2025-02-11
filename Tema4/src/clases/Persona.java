package clases;

public class Persona {
	String nombre = "";
	int edad;
	double estatura;
	String DNI;
	static DiaSemana hoy = DiaSemana.DOMINGO;
	
	enum DiaSemana { LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO};

	public static void hoyEs(int dia) {
		hoy = switch(dia) {
		case 1 -> DiaSemana.LUNES;
		case 2 -> DiaSemana.MARTES;
		// ...
		default -> DiaSemana.DOMINGO;
		};
	}
	
//	public void diaSemana() {
//		hoy = "Miércoles";
//	}

}
