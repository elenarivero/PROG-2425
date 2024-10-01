package parte2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Variable donde almacenar los segundos que introduce el usuario
		int seconds;
		
		// Variable para las horas finales
		int hours;
		
		// Variable para los minutos finales
		int minutes;
		
		// Variable para los segundos finales
		int finalSeconds;
		
		// Creación del Scanner para leer de teclado
		Scanner reader = new Scanner(System.in);
		
		// Le pido al usuario la cantidad de segundos
		System.out.println("Introduce la cantidad de segundos");
		seconds = reader.nextInt();
		
		// Operaciones para obtener las horas, los minutos y los segundos
		hours = seconds / 3600;
		minutes = (seconds % 3600) / 60;
		finalSeconds = seconds % 60;
		
		// Mostramos el resultado final
		System.out.println(hours + " horas, " + minutes + " minutos, " + finalSeconds + " segundos");

		// Cerramos el Scanner
		reader.close();
	}

}
