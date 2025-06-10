package personajes;

public class Pocion {
	enum Tipo {
		MANA, VIDA
	};

	private Tipo tipoPocion;

	private int cantidad = 10;

	/**
	 * Constructor de poción
	 * 
	 * @param tipo     El tipo de la poción. Los únicos valores permitidos son VIDA
	 *                 o MANA, si se introduce un valor errónea se asignará VIDA por
	 *                 defecto
	 * @param cantidad Tiene que ser una cantidad positiva. Si no se introduce una
	 *                 cantidad positiva, se asignará 10 por defecto
	 */
	public Pocion(String tipo, int cantidad) {
		try {
			tipoPocion = Tipo.valueOf(tipo.toUpperCase());
		} catch (IllegalArgumentException e) {
			tipoPocion = Tipo.VIDA;
		}

		if (cantidad > 0) {
			this.cantidad = cantidad;
		}
	}

	public String getTipo() {
		return String.valueOf(tipoPocion);
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		if (obj instanceof Pocion nuevaPoc) {
			if (this.tipoPocion.equals(nuevaPoc.tipoPocion) && this.cantidad == nuevaPoc.cantidad) {
				res = true;
			}
		}

		return res;
	}

	@Override
	public String toString() {

		return tipoPocion + ": " + cantidad;
	}
}
