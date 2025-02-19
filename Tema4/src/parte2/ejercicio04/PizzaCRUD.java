package parte2.ejercicio04;

import java.util.HashSet;
import java.util.Set;

public class PizzaCRUD {

	// Atributo que va a ser la colección donde almacenar nuestros objetos
	private Set<Pizza> pizzas = new HashSet<Pizza>();

	public void listarPizzas() {
		for (Pizza p : pizzas) {
			System.out.println(p);
			System.out.println("---------------------");
		}
	}

	public boolean añadePizza(Pizza p) {
		return pizzas.add(p);
	}

	/**
	 * Método que busca una pizza en el conjunto a partir de un código
	 * 
	 * @param codigo Código de la pizza a buscar
	 * @return Objeto Pizza que tiene el mismo código introducido. null si no existe
	 */
	public Pizza buscaPizza(int codigo) {
		Pizza p = null;
		
		for(Pizza pBusqueda : pizzas) {
			if(pBusqueda.getCodigo() == codigo) {
				p = pBusqueda;
			}
		}
		
		return p;
	}
}
