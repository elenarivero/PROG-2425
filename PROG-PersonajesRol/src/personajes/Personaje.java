package personajes;

import java.util.ArrayList;
import java.util.List;

import excepciones.ManaNegativoException;
import excepciones.VidaNegativaException;
import personajes.Pocion.Tipo;

/**
 * Clase Personaje que representa a los personajes de un juego de rol Implementa
 * la interfaz Comparable para ordenarlos por el nombre
 */
public abstract class Personaje implements Comparable<Personaje> {

	/**
	 * Nombre del personaje
	 */
	private String nombre;

	/**
	 * Nivel de personaje
	 */
	private int nivel = 0;

	/**
	 * Los puntos de vida del personaje
	 */
	private int pVida;

	/**
	 * Los puntos de maná del personaje. 
	 * Se define protected para facilitar las operaciones posteriores.
	 */
	protected int pMana;

	/**
	 * Indica si el escudo está activo o no
	 */
	private boolean escudo = false;

	/**
	 * Listado de pociones del personaje
	 */
	List<Pocion> pociones = new ArrayList<>();

	/**
	 * Constructor de la clase Personaje
	 * 
	 * @param nombre Nuevo nombre del personaje. No puede ser null ni vacío.
	 * @param pVida  La cantidad de vida con la comienza el personaje. No puede ser
	 *               negativa ni 0
	 * @param pMana  La cantidad de maná con la comienza el personaje. No puede ser
	 *               negativa, pero sí 0
	 * @throws VidaNegativaException Se lanzará en el caso de que la vida
	 *                               introducida sea negativa o 0
	 * @throws ManaNegativoException Se lanzará en el caso de que el maná
	 *                               introducido sea negativo
	 */
	public Personaje(String nombre, int pVida, int pMana) throws VidaNegativaException, ManaNegativoException {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (pVida > 0) {
			this.pVida = pVida;
		} else {
			throw new VidaNegativaException();
		}

		if (pMana >= 0) {
			this.pMana = pMana;
		} else {
			throw new ManaNegativoException();
		}
	}

	/**
	 * getter del nivel del personaje
	 * 
	 * @return Devuelve el nivel del personaje
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Modifica el nivel del personaje a un valor concreto
	 * 
	 * @param nivel El nuevo nivel del personaje. Tiene que ser mayor o igual que 0
	 */
	public void setNivel(int nivel) {
		if (nivel >= 0) {
			this.nivel = nivel;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getpVida() {
		return pVida;
	}

	public int getpMana() {
		return pMana;
	}

	public boolean isEscudo() {
		return escudo;
	}

	public List<Pocion> getPociones() {
		return pociones;
	}

	
	public void activaEscudo() {
		escudo = true;
	}
	
	/**
	 * El personaje recibe una cantidad de daño. Si el personaje tiene el escudo
	 * activo no recibirá daño pero desactivará el escudo. Si no tiene escudo se le
	 * restará a la vida la cantidad de daño recibida. Si la cantidad de daño es
	 * superior a la de vida, la vida se quedará en 0.
	 * 
	 * @param daño Cantidad de daño que recibe el personaje
	 */
	public void recibirDaño(int daño) {
		if (!escudo) {
			pVida -= daño;
			if (pVida < 0) {
				pVida = 0;
			}
		} else {
			escudo = false;
		}
	}

	public boolean recuperarVida(int cantVida) {
		boolean res = false;

		if (cantVida > 0) {
			this.pVida += cantVida;
			res = true;
		}

		return res;
	}

	public boolean recuperarMana(int cantMana) {
		boolean res = false;
		if (cantMana >= 0) {
			this.pMana += cantMana;
			res = true;
		}

		return res;
	}

	public boolean cogerPocion(Pocion pocion) {
		return pociones.add(pocion);
	}

	/**
	 * Usa una poción que recibe por parámetro y la elimina de su inventario. Si es
	 * de tipo VIDA recuperará vida y si es de tipo MANA recuperará maná.
	 * 
	 * @param pocion Poción que usa el personaje
	 * @return Devuelve true si la poción estaba en su inventario y se elimina.
	 *         Devolverá false si la poción no está en el inventario.
	 */
	public boolean usarPocion(Pocion pocion) {
		boolean res = false;

		if (pociones.remove(pocion)) {
			if (pocion.getTipo().equals("MANA")) {
				recuperarMana(pocion.getCantidad());
			} else {
				recuperarVida(pocion.getCantidad());
			}
			res = true;
		}
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		if (obj instanceof Personaje nuevoPer) {
			if (nombre.equals(nuevoPer.nombre)) {
				res = true;
			}
		}

		return res;
	}

	private String stringPociones() {
		String res = "";

		for (Pocion poc : pociones) {
			res += poc.toString() + ", ";
		}

		res = res.substring(0, res.length()-2);
		
		return res;
	}

	@Override
	public String toString() {
		String res = "";

		res += this.nombre + " - nivel: " + nivel + " - PV: " + pVida + " - PM: " + pMana;

		if (escudo) {
			res += " - Escudo activo";
		}
		
		res += "\nPociones: " + stringPociones();

		return res;
	}

	@Override
	public int compareTo(Personaje nuevoPer) {
		return this.nombre.compareTo(nuevoPer.nombre);
	}

}
