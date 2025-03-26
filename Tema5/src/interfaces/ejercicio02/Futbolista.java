package interfaces.ejercicio02;

public class Futbolista implements Comparable<Futbolista> {
	
	private int numCamiseta;
	
	private String nombre;
	
	

	@Override
	public int compareTo(Futbolista o) {
		int res = 0;
		
		res = this.numCamiseta - o.numCamiseta;
		
		if(res == 0) {
			res = this.nombre.compareTo(o.nombre);
		}
		
		return res;
	}

}
