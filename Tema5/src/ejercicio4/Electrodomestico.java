package ejercicio4;

public class Electrodomestico {

	private double precio = 0;
	
	public Electrodomestico(double p) throws NegativePriceException {
		if(p >= 0) {
			precio = p;
		} else {
			throw new NegativePriceException();
		}
		
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double p) {
		precio = p;
	}
	
	
}
