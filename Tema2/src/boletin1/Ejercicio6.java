package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// A continuación se crean las variables para los coeficientes de la ecuación
		int a;
		int b;
		int c;

		// Creamos dos variables para las soluciones
		double x1;
		double x2;

		// Creo variable donde almacenar el discriminante
		double discriminante;
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario los coeficientes de la ecuación
		System.out.println("Introduzca los coeficintes de una ecuación de 2º grado");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();

		// si a == 0
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación sólo tiene una solución: " + x1);
		} else {
			discriminante = b * b - 4 * a * c;

			if (discriminante < 0) {
				System.out.println("La ecuación no tiene solución");
			} else {
				// (-5 + 3) /4 = -2 / 4
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				// (-5 -3/ 4 = -2
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("Primera solución: x1 = " + x1);
				System.out.println("Segunda solución: x2 = " + x2);
			}
		}

		reader.close();
	}

}
