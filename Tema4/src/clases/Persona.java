package clases;

public class Persona {
	String nombre = "";
	int edad;
	double estatura;
	String DNI;
	static String hoy;

	public static void hoyEs(int dia) {
		hoy = switch(dia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		// ...
		default -> "Domingo";
		};
	}
	
//	public void diaSemana() {
//		hoy = "Miércoles";
//	}

}
