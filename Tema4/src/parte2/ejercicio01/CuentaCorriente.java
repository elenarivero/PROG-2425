package parte2.ejercicio01;

import java.util.Objects;

public class CuentaCorriente{

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	private String dni;

	private String nombre = "";

	private double saldo;

	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	public CuentaCorriente(String dni, double saldoInicial) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldoInicial) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}

	public CuentaCorriente(String dni, String nombre, double saldoInicial, String nacionalidad) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}

		
		switch (nacionalidad) {
		case "EXTRANJERA" -> this.nacion = Nacionalidad.EXTRANJERA;
		}
	}

	public Nacionalidad getNacion() {
		return nacion;
	}
	
	
	@Override
	public String toString() {
		String res = "";
		
		res = "DNI: " + this.dni + "\n";
		res += "Nombre: " + this.nombre + "\n";
		res += "Saldo: " + this.saldo + "\n";
		res += "Nacionalidad: " + this.nacion + "\n";
		
		return res;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	
	@Override
	public boolean equals(Object obj) {
		CuentaCorriente cuenta2 = (CuentaCorriente) obj;
		
		boolean res = false;
		
		if(this.dni.equals(cuenta2.dni) && this.nombre.equals(cuenta2.nombre)) {
			res = true;
		}
		
		return res;
	}

	
	
}
