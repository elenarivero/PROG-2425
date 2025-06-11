package examen.mandos;

import examen.excepciones.ModeloException;
import examen.excepciones.PrecioException;
import examen.interfaces.Velocidad;

public class MandoAireAcondicionado extends Mando implements Velocidad{

	enum Modo {FRIO, CALOR};
	
	private Modo modoAire = Modo.FRIO;
	private int temperatura = 24;
	private int velocidad = 0;
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura) throws ModeloException {
		super(modelo, altura, anchura);
	}
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura, double precio) throws ModeloException, PrecioException {
		super(modelo, altura, anchura, precio);
	}

	public Modo getModoAire() {
		return modoAire;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	
	public void cambiarModo() {
		modoAire = modoAire.equals(Modo.FRIO) ? Modo.CALOR : Modo.FRIO;
	}
	
	public boolean subirTemperatura() {
		boolean res = false;
		
		if(temperatura < 30) {
			temperatura++;
			res = true;
		}
		
		return res;
	}
	
	public boolean bajarTemperatura() {
		boolean res = false;
		
		if(temperatura > 16) {
			temperatura--;
			res = true;
		}
		
		return res;
	}
	
	@Override
	public boolean subirVelocidad() {
		boolean res = false;
		
		if(velocidad < 5) {
			velocidad++;
			res = true;
		}
		
		return res;
		
	}

	@Override
	public boolean bajarVelocidad() {
		boolean res = false;
		
		if(velocidad > 0) {
			velocidad--;
			res = true;
		}
		
		return res;
		
	}

}
