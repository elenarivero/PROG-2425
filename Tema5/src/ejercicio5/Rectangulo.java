package ejercicio5;

public class Rectangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;
	
	public Rectangulo() {
		super(4);
	}
	
	public Rectangulo(double lado1, double lado2) {
		super(4);
		if(lado1 > 0) {
			this.lado1 = lado1;
		}
		if(lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	@Override
	public double area() {
		return lado1*lado2;
	}

	
}
