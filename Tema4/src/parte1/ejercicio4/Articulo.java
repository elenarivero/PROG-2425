package parte1.ejercicio4;

import parte1.ejercicio2.*;

public class Articulo {

	String nombre;
	double precio;
	public static final double IVA = 21;
	int cuantosQuedan;
	
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
