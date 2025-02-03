package parte1.ejercicio2;

import java.util.Scanner;

public class PersonaPrincipal {

	public static void main(String[] args) {
		// Creamos dos objetos de tipo Persona
		Persona per1 = new Persona();
		Persona per2 = new Persona();

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos los datos de la persona 1
		System.out.println("Datos de la Persona 1");
		System.out.println("Introduzca el dni");
		per1.dni = reader.nextLine();

		System.out.println("Introduzca el nombre");
		per1.nombre = reader.nextLine();

		System.out.println("Introduzca los apellidos");
		per1.apellidos = reader.nextLine();

		System.out.println("Introduzca la edad");
		per1.edad = reader.nextInt();
		reader.nextLine();

		// Pedimos los datos de la persona 2
		System.out.println("Datos de la Persona 2");
		System.out.println("Introduzca el dni");
		per2.dni = reader.nextLine();

		System.out.println("Introduzca el nombre");
		per2.nombre = reader.nextLine();

		System.out.println("Introduzca los apellidos");
		per2.apellidos = reader.nextLine();

		System.out.println("Introduzca la edad");
		per2.edad = reader.nextInt();

		// Imprimimos los datos de forma bonita
		System.out.println(per1.nombre + " " + per1.apellidos + " con dni " + per1.dni + (per1.edad < 18 ? " no" : "")
				+ " es mayor de edad");
		System.out.println(per2.nombre + " " + per2.apellidos + " con dni " + per2.dni + (per2.edad < 18 ? " no" : "")
				+ " es mayor de edad");

		// Cerramos el Scanner
		reader.close();
	}

}
