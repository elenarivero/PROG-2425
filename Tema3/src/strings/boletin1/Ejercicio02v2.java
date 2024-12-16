package strings.boletin1;

import java.util.Scanner;

public class Ejercicio02v2 {

	public static void main(String[] args) {
		// Contraseña a adivinar
		String contrasenya = "";
		
		// Contraseña introducida por el usuario
		String contUsuario = "";
		
		// Creamos el Scanner para leer el dato
		Scanner reader = new Scanner(System.in);
		
		// Variable donde almacenar el resultado de la comparación
		int comparacion;
		
		// Le pedimos al usuario la contraseña a adivinar
		System.out.println("Introduzca una contraseña:");
		contrasenya = reader.nextLine();
		
		// Le preguntamos al usuario qué contraseña cree que es
		System.out.println("¿Qué contraseña crees que es?");
		contUsuario = reader.nextLine();
		
		// Seguimos preguntando hasta que acierte
		while(!contrasenya.equals(contUsuario)) {
			// Almacenamos en comparacion el resultado del compareTo
			comparacion = contUsuario.compareTo(contrasenya);
			
			if(comparacion < 0) {
				System.out.println("Su contraseña es menor alfabéticamente que la contraseña a adivinar");
			} else if (comparacion > 0) {
				System.out.println("Su contraseña es mayor alfabéticamente que la contraseña a adivinar");
			}
			
			// Le preguntamos al usuario qué contraseña cree que es
			System.out.println("¿Qué contraseña crees que es?");
			contUsuario = reader.nextLine();
		}
		
		// Le decimos al usuario que ha acertado
		System.out.println("¡¡ENHORABUENA!! HA ACERTADO");
		
		
		// Cerramos el scanner
		reader.close();

	}

}
