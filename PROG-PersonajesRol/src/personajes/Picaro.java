package personajes;

import excepciones.ManaNegativoException;
import excepciones.VidaNegativaException;
import interfaces.Ataque;

public class Picaro extends Personaje implements Ataque{

	public Picaro(String nombre, int pVida, int pMana) throws VidaNegativaException, ManaNegativoException {
		super(nombre, pVida, pMana);
	}

	
	@Override
	public String toString() {
		return "Pícaro - " + super.toString();
	}


	@Override
	public boolean atacar(Personaje per) {
		boolean res = false;
		int cant = (int) (this.pMana * 0.1);
		
		if(this.pMana >= cant) {
			this.pMana -= cant;
			per.recibirDaño(cant);
			res = true;
		}
		
		return res;
		
	}
}
