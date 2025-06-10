package personajes;

import excepciones.ManaNegativoException;
import excepciones.VidaNegativaException;
import interfaces.Ataque;
import interfaces.Cura;

public class Mago extends Personaje implements Cura, Ataque{

	public Mago(String nombre, int pVida, int pMana) throws VidaNegativaException, ManaNegativoException {
		super(nombre, pVida, pMana);
	}

	@Override
	public String toString() {
		return "Mago - " + super.toString();
	}

	@Override
	public boolean atacar(Personaje per) {
		boolean res = false;
		int cant = (int) (this.pMana * 0.25);
		
		if(this.pMana >= cant) {
			this.pMana -= cant;
			per.recibirDaño(cant);
			res = true;
		}
		
		return res;
		
	}

	@Override
	public void curar(Personaje per) {

		int cant = this.getNivel() * 8;
		per.recuperarVida(cant);
		
	}
}
