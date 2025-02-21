package parte2.ejercicio04;

import java.util.Objects;

public class Pizza {

	enum Tamaño {
		MEDIANA, FAMILIAR
	};

	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	};

	enum Estado {
		PEDIDA, SERVIDA
	};

	private int codigo;
	private Tamaño tamaño = Tamaño.MEDIANA;
	private Tipo tipo = Tipo.MARGARITA;
	private Estado estado = Estado.PEDIDA;

	public Pizza(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}
	
	public Pizza(int codigo, String tamaño, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (tamaño != null && !tamaño.isBlank()) {
			compruebaTamaño(tamaño.toUpperCase());
		}

		if (tipo != null && !tipo.isBlank()) {
			compruebaTipo(tipo.toUpperCase());
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		if (tamaño != null)
			compruebaTamaño(tamaño);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null)
			compruebaTipo(tipo.toUpperCase());
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		compruebaEstado(estado.toUpperCase());
	}

	private void compruebaTamaño(String tamaño) {
		switch (tamaño) {
		case "MEDIANA", "FAMILIAR" -> this.tamaño = Tamaño.valueOf(tamaño);
		}
	}

	private void compruebaTipo(String tipo) {
		switch (tipo) {
		case "MARGARITA", "CUATRO_QUESOS", "FUNGHI" -> this.tipo = Tipo.valueOf(tipo);
		}
	}

	private void compruebaEstado(String estado) {
		switch (estado) {
		case "PEDIDA", "SERVIDA" -> this.estado = Estado.valueOf(estado);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		Pizza pizza2 = (Pizza) obj;
		if (this.codigo == pizza2.codigo) {
			res = true;
		}

		return res;
	}

	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}

}
