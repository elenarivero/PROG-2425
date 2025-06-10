package crud.disco;

import java.util.Scanner;

public class DiscoMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Disco disco;
		int codigo;
		int opcion;
		String autor;

		do {
			menu();
			opcion = reader.nextInt();
			switch (opcion) {
			case 1 -> { // Pintar discos
				DiscoCRUD.pintaLista();
			}
			case 2 -> { // Nuevo disco
				// Pedir datos del disco
				disco = creaDisco();
				if (DiscoCRUD.añadeDisco(disco)) {
					System.out.println("Disco añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir el disco");
				}
			}
			case 3 -> { // Eliminar
				codigo = pideCodigo();
				disco = new Disco(codigo);
				if (DiscoCRUD.eliminaDisco(disco)) {
					System.out.println("Disco eliminado correctamente");
				} else {
					System.out.println("No existe disco con ese código");
				}
			}
			case 4 -> {// Modificar disco
				codigo = pideCodigo();
				disco = new Disco(codigo);
				autor = pideAutor();
				if (DiscoCRUD.modificaAutor(disco, autor)) {
					System.out.println("Modificado correctamente");
				} else {
					System.out.println("No existe el disco con ese código");
				}
			}
			case 5 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Opción no correcta");
			}
			}
		} while (opcion != 5);

		reader.close();

	}

	public static Disco creaDisco() {
		Disco disco = null;

		int codigo;
		String autor;
		String titulo;
		double duracion;
		String genero;

		codigo = pideCodigo();

		autor = pideAutor();

		System.out.println("Introduzca el titulo:");
		titulo = reader.nextLine();

		System.out.println("Introduzca la duración:");
		duracion = reader.nextDouble();
		reader.nextLine();

		System.out.println("Introduzca el género:");
		genero = reader.nextLine();

		disco = new Disco(codigo, autor, titulo, duracion, genero);

		return disco;
	}

	private static String pideAutor() {
		String autor;
		System.out.println("Introduzca el autor:");
		autor = reader.nextLine();
		return autor;
	}

	private static int pideCodigo() {
		int codigo;
		System.out.println("Introduzca el código:");
		codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}

	public static void menu() {
		System.out.println("Seleccione una opción:");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Borrar");
		System.out.println("4. Modificar autor");
		System.out.println("5. Salir");
	}

}
