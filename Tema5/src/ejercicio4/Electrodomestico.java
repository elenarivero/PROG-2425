package ejercicio4;

public abstract class Electrodomestico {

	private double precio = 0;
	
	public Electrodomestico(double p) {
		precio = p;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double p) {
		precio = p;
	}
	
	/**
	 * 
	 * @return
	 */
	public abstract double calculaPrecio();
}
