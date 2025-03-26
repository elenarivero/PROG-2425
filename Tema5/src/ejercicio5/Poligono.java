package ejercicio5;

public abstract class Poligono {

	private int numLados;
	
	public Poligono(int numLados) {
		if(numLados > 2)
			this.numLados = numLados;
	}

	public abstract double area();
	
}
