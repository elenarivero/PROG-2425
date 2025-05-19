package crud.interfaz;

import java.util.Scanner;

import crud.dao.EstudianteDAO;
import crud.entidades.Estudiante;

public class EstudianteMain {

	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Estudiante est;
		EstudianteDAO estDAO = new EstudianteDAO();
		int opc = 0;
		
		if(estDAO.getConexion() != null) {
			
			System.out.println("BIEVENIDO AL IES NERVIÓN");
			menu();
			opc = reader.nextInt();
			reader.nextLine();
		
			while(opc != 0) {
				switch(opc) {
				case 1 -> {
					// Leer datos del estudiante
					est = leerDatos();
					// Insertamos datos en la base de datos
					estDAO.create(est);
				}
				case 2 -> System.out.println("Consultar");
				case 3 -> System.out.println("Actualizar");
				case 4 -> System.out.println("Eliminar");
				default -> System.out.println("Opción no correcta");
				}
				
				menu();
				opc = reader.nextInt();
				reader.nextLine();
			}
			
			System.out.println("Saliendo del sistema...");
		} 
			
		reader.close();
	}

	
	private static Estudiante leerDatos() {
		Estudiante est = null;
		
		String nombre;
		String apellido;
		String fechaNacimiento;
		String email;
		String telefono;
		
		System.out.println("Introduzca el nombre del estudiante");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca el apellido del estudiante");
		apellido = reader.nextLine();
		
		System.out.println("Introduzca la fecha de nacimiento del estudiante (aaaa-mm-dd)");
		fechaNacimiento = reader.nextLine();
		
		System.out.println("Introduzca el email del estudiante");
		email = reader.nextLine();
		
		System.out.println("Introduzca el telefono del estudiante");
		telefono = reader.nextLine();
		
		est = new Estudiante(nombre, apellido, fechaNacimiento, email, telefono);
		
		return est;
	}
	
	
	private static void menu() {
		System.out.println("¿Qué desea hacer?");
		System.out.println("1. Crear estudiante");
		System.out.println("2. Consultar estudiante");
		System.out.println("3. Actualizar estudiante");
		System.out.println("4. Borrar estudiante");
		System.out.println("0. Salir");
		
	}
}
