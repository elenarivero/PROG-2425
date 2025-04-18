package parte1.ejercicio1;

public class PuntoPrincipal {

	public static void main(String[] args) {
		// Creamos 3 puntos
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);

		// Mostramos por pantalla los 3 puntos
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");

		// Realizamos operaciones varias sobre los puntos
		p1.x += 2;
		p1.y -= 3;

		p2.x *= 2;
		p2.y = 5;

		p3.x /= 3;
		p3.y %= 5;
		
		// Volvemos a imprimir los puntos
		System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
		System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
		System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");
	}

}
