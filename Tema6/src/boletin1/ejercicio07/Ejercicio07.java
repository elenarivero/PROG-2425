package boletin1.ejercicio07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {

	public static final String FICHERO = "src\\boletin1\\ejercicio07\\agenda.txt";
	public static Map<String, Integer> contactos = new TreeMap<>();
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opc;

		// 1º leer fichero
		leeFichero();

		// Mostramos menu
					menu();
					opc = reader.nextInt();
		while (opc != 4) {
			
			
			
			switch(opc) {
			case 1 ->{ añadirContacto();
			
			}
			case 2 -> System.out.println("Buscar por nombre");
			case 3 -> System.out.println("Mostrar todos");
			
			default -> System.out.println("Opción errónea");
			}

		}

		reader.close();
	}

	public static void leeFichero() {

		try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {

			String[] datos;

			String linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
				contactos.put(datos[0], Integer.parseInt(datos[1]));

				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			try {
				FileWriter f = new FileWriter(FICHERO);
				f.close();
			} catch (IOException e1) {
				System.out.println("Error al crear el fichero: " + e1.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}

	}

	public static void menu() {
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Mostrar todos");
		System.out.println("4. Salir");
		System.out.println("Seleccione una opción:");
	}
	
	public static boolean añadirContacto() {
		boolean res = false;
		
		String nombre;
		int telefono;
		
		System.out.println("Introduzca el nombre:");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca el teléfono:");
		telefono = reader.nextInt();
		
		if(contactos.size() < 20 && !contactos.containsKey(nombre)) {
			contactos.put(nombre, telefono);
			res = true;
		}
		
		return res;
	}
}
