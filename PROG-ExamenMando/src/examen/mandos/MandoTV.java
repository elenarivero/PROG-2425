package examen.mandos;

import examen.excepciones.ModeloException;
import examen.excepciones.PrecioException;
import examen.interfaces.Volumen;

public class MandoTV extends Mando implements Volumen {

	private int volumen = 0;
	private int canal = 1;

	public MandoTV(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, altura, anchura);

	}

	public MandoTV(String modelo, double altura, double anchura, double precio)
			throws ModeloException, PrecioException {
		super(modelo, altura, anchura, precio);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (canal >= 1) {
			this.canal = canal;
		}
	}

	public int getVolumen() {
		return volumen;
	}

	public void subirCanal() {
		canal++;
	}

	public boolean bajarCanal() {
		boolean res = false;

		if (canal > 1) {
			canal--;
			res = true;
		}

		return res;
	}

	@Override
	public boolean subirVolumen() {
		boolean res = false;

		if (volumen <= 95) {
			volumen += 5;
			res = true;
		}

		return res;
	}

	@Override
	public boolean bajarVolumen() {
		boolean res = false;
		
		if(volumen >= 5) {
			volumen -= 5;
			res = true;
		}
		
		return res;
	}

	@Override
	public String toString() {
		String res = "Mando TV\n";
		res += super.toString();
		res += "Canal: " + canal + "\n";
		res += "Volumen: " + volumen + "\n";
		
		return res;
	}
}
