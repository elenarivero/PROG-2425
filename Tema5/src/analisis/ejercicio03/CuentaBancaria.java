package analisis.ejercicio03;

import java.util.Set;
import java.util.TreeSet;

public class CuentaBancaria {
	
	private String numCuenta;
	private double saldo = 0;
	private Set<Titular> titulares = new TreeSet<Titular>();
	
	public CuentaBancaria(String numCuenta, Titular t) {
		if(t != null) {
			titulares.add(t);
		}
		
		if(numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}
	}
	

}
