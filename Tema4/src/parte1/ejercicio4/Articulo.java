package parte1.ejercicio4;

public class Articulo {

	private String nombre;
	private double precio;
	public static final double IVA = 21;
	private int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if(precio > 0) {
			this.precio = precio;
		}
		
		if(cuantosQuedan > 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	
}
