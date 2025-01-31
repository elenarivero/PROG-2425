package colecciones.boletin2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio06 {

	// Scanner para leer de teclado
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// La estructura va a ser un mapa donde la clave sea el nombre y el valor va a
		// ser un conjunto de teléfonos
		Map<String, Set<Integer>> agenda = new HashMap<>();

		// Conjunto para almacenar los teléfonos
		Set<Integer> telefonos;
		
		// Opción elegida
		int opc;

		// Nombre de la persona
		String nombre;
		
		// Variable para almacenar un teléfono
		int telefono;

		do {
			menu();
			System.out.println("Introduzca una opción:");
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {
			case 1 -> {
				nombre = leeNombre();
				// Comprobamos si la persona está en la agenda	
				if(agenda.containsKey(nombre)) {
					System.out.println("La persona ya existe");
				} else {
					agenda.put(nombre, new HashSet<Integer>());
				}
			}
			case 2 -> {
				nombre = leeNombre();
				if(agenda.containsKey(nombre)) {
					telefono = leeTelefono();
					// Almaceno en teléfonos el conjunto asociado a nombre
					telefonos = agenda.get(nombre);
					
					// Añadimos el teléfono al conjunto
					if(telefonos.add(telefono)) {
						System.out.println("El teléfono se ha añadido correctamente");
					} else {
						System.out.println("El teléfono ya existe para la persona dada");
					}
				} else {
					System.out.println("La persona no existe");
				}
			}
			case 3 -> {
				// Leemos el nombre
				nombre = leeNombre();
				if(agenda.containsKey(nombre)) {
					System.out.println(nombre + ": " + agenda.get(nombre));
				} else {
					System.out.println("La persona no existe");
				}
			}
			case 4 -> {// Eliminar el teléfono de una persona
				// Preguntamos el nombre de la persona
				nombre = leeNombre();
				if(agenda.containsKey(nombre)) {
					telefono = leeTelefono();
					telefonos = agenda.get(nombre);
					if(telefonos.remove(telefono)) {
						System.out.println("Teléfono eliminado correctamente");
					} else {
						System.out.println("El teléfono no existe.");
					}
				} else {
					System.out.println("La persona no existe");
				}
			}
			case 5 -> {// Eliminar persona
				nombre = leeNombre();
				if(agenda.remove(nombre)!=null) {
					System.out.println("Se ha eliminado correctamente");
				} else {
					System.out.println("La persona no existe");
				}
			}
			}

			System.out.println(agenda);
		} while (opc != 0);

		// Cerramos el Scanner
		reader.close();

	}

	private static String leeNombre() {
		String nombre;
		System.out.println("Introduzca el nombre de la persona:");
		nombre = reader.nextLine();
		return nombre;
	}
	
	private static int leeTelefono() {
		int telefono;
		System.out.println("Introduzca un teléfono:");
		telefono = reader.nextInt();
		return telefono;
	}

	static void menu() {
		System.out.println("1. Añadir persona");
		System.out.println("2. Añadir teléfono");
		System.out.println("3. Mostrar teléfonos");
		System.out.println("4. Eliminar teléfono");
		System.out.println("5. Eliminar persona");
		System.out.println("0. Salir");
	}
}
