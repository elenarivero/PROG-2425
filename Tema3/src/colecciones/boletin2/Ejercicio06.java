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

		// Siempre que tengamos un menú de opciones se hace con do-while y dentro un
		// switch
		do {
			// Pintamos el menú
			menu();

			// Pedimos una opción al usuario
			System.out.println("Introduzca una opción:");
			opc = reader.nextInt();

			// Este nextLine() me sirve para limpiar el Scanner
			reader.nextLine();

			// Compruebo el valor de la opción
			switch (opc) {
			case 1 -> { // 1. Añadir persona

				// Le preguntamos por el nombre de la persona a añadir
				nombre = leeNombre();

				// Comprobamos si la persona está en la agenda
				if (agenda.containsKey(nombre)) {
					System.out.println("La persona ya existe");
				} else {
					agenda.put(nombre, new HashSet<Integer>());
				}
			}
			case 2 -> { // 2. Añadir teléfono

				// Preguntamos por el nombre de la persona a la que añadir el teléfono
				nombre = leeNombre();

				// Comprobamos si la persona existe
				if (agenda.containsKey(nombre)) {

					// Tomamos los teléfonos de la persona en cuestión
					telefono = leeTelefono();

					// Almaceno en teléfonos el conjunto asociado a nombre
					telefonos = agenda.get(nombre);

					// Añadimos el teléfono al conjunto
					if (telefonos.add(telefono)) {
						// Si devuelve true es que el teléfono no existía y se ha añadido correctamente
						System.out.println("El teléfono se ha añadido correctamente");
					} else {
						// Si devuelve true es que el teléfono ya existía y no se ha podido añadir
						System.out.println("El teléfono ya existe para la persona dada");
					}
				} else {
					// Si la persona no está en el mapa mostramos el mensaje correspondiente
					System.out.println("La persona no existe");
				}
			}
			case 3 -> {// 3. Mostrar teléfonos
				// Leemos el nombre
				nombre = leeNombre();

				// Comprobamos si la persona existe
				if (agenda.containsKey(nombre)) {
					// Imprimimos los teléfonos de la persona
					System.out.println(nombre + ": " + agenda.get(nombre));
				} else {
					// Mensaje para indicar que la persona introducida no existe
					System.out.println("La persona no existe");
				}
			}
			case 4 -> {// 4. Eliminar el teléfono de una persona
				// Preguntamos el nombre de la persona
				nombre = leeNombre();

				// Obtenemos los teléfonos de la persona. Si la persona no existe devolverá null
				telefonos = agenda.get(nombre);

				// Comprobamos si la persona existe
				if (telefonos != null) {

					// Si la persona existe preguntamos por el teléfono a eliminar
					telefono = leeTelefono();

					if (telefonos.remove(telefono)) {
						// Si devuelve true es que se ha podido eliminar correctamente
						System.out.println("Teléfono eliminado correctamente");
					} else {
						// Si devuelve false es que el teléfono no existía en el conjunto y no se podía
						// eliminar
						System.out.println("El teléfono no existe.");
					}
				} else {
					// Indicamos que la persona introducida no existe
					System.out.println("La persona no existe");
				}
			}
			case 5 -> {// Eliminar persona
				
				// Pedimos el nombre de la persona a eliminar
				nombre = leeNombre();
				
				if (agenda.remove(nombre) != null) {
					// Si al eliminar devuelve un valor distinto de null es que se ha podido eliminar correctamente
					System.out.println("Se ha eliminado correctamente");
				} else {
					// Si devuelve null es que la persona no existe en el mapa
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
