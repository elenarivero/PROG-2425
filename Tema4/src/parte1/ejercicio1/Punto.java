package parte1.ejercicio1;

public class Punto {

	/**
	 * Coordenada x del punto
	 */
	int x;
	
	/**
	 * Coordenada y del punto
	 */
	int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distancia(Punto p) {
		double cateto = Math.pow(p.x-this.x, 2);
		
		return 0.0;
	}
}
