package parte1.ejercicio2;

import java.util.Scanner;

public class PersonaPrincipal {

	public static void main(String[] args) {
		// Creamos dos objetos de tipo Persona
		Persona per1;
		Persona per2;

		String dni;
		String nombre;
		String apellidos;
		int edad;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos los datos de la persona 1
		System.out.println("Datos de la Persona 1");
		System.out.println("Introduzca el dni");
		dni = reader.nextLine();

		System.out.println("Introduzca el nombre");
		nombre = reader.nextLine();

		System.out.println("Introduzca los apellidos");
		apellidos = reader.nextLine();

		System.out.println("Introduzca la edad");
		edad = reader.nextInt();
		reader.nextLine();

		per1 = new Persona(dni, nombre, apellidos, edad);
		
		
		// Pedimos los datos de la persona 2
		System.out.println("Datos de la Persona 2");
		System.out.println("Introduzca el dni");
		dni = reader.nextLine();

		System.out.println("Introduzca el nombre");
		nombre = reader.nextLine();

		System.out.println("Introduzca los apellidos");
		apellidos = reader.nextLine();

		System.out.println("Introduzca la edad");
		edad = reader.nextInt();

		per2 = new Persona(dni, nombre, apellidos, edad);
		
		
		// Imprimimos los datos de forma bonita
		System.out.println(per1.nombre + " " + per1.apellidos + " con dni " + per1.dni + (per1.edad < 18 ? " no" : "")
				+ " es mayor de edad");
		System.out.println(per2.nombre + " " + per2.apellidos + " con dni " + per2.dni + (per2.edad < 18 ? " no" : "")
				+ " es mayor de edad");

		// Cerramos el Scanner
		reader.close();
	}

}
