package examen.mandos;

import examen.excepciones.ModeloException;
import examen.excepciones.PrecioException;
import examen.interfaces.Volumen;

public class MandoMinicadena extends Mando implements Volumen {

	private int volumen = 0;

	public MandoMinicadena(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, altura, anchura);
	}

	public MandoMinicadena(String modelo, double altura, double anchura, double precio)
			throws ModeloException, PrecioException {
		super(modelo, altura, anchura, precio);
	}

	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean subirVolumen() {
		boolean res = false;

		if (volumen <= 90) {
			volumen += 10;
			res = true;
		}

		return res;
	}

	@Override
	public boolean bajarVolumen() {
		boolean res = false;

		if (volumen > 0) {
			volumen--;
			res = true;
		}

		return res;
	}

	@Override
	public String toString() {
		String res = super.toString();

		res += "Volumen " + volumen + "\n";
		return res;
	}

}
