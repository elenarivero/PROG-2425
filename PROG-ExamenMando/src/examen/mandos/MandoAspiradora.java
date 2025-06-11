package examen.mandos;

import examen.excepciones.ModeloException;
import examen.interfaces.Velocidad;

public class MandoAspiradora extends Mando implements Velocidad {
	private int velocidad;

	public MandoAspiradora(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, altura, anchura);
	}

	public MandoAspiradora(String modelo, double altura, double anchura, double precio) throws ModeloException {
		super(modelo, altura, anchura);
	}

	@Override
	public boolean subirVelocidad() {
		boolean res = false;

		if (velocidad < 3) {
			velocidad++;
			res = true;
		}

		return res;
	}

	@Override
	public boolean bajarVelocidad() {
		// TODO Auto-generated method stub
		return false;
	}

}
