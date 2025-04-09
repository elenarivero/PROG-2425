package examen.mando;

public class Mando implements Comparable<Mando> {
	
	private String modelo;
	private double altura;
	private double anchura;
	private double precio;
	private boolean encendido = false;
	
	public Mando(String modelo, double altura, double anchura) throws ModeloException{
		if(modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ModeloException();
		}
		
		this.altura = altura;
		this.anchura = anchura;
		
	}
	
	/**
	 * 
	 * @param modelo
	 * @param altura
	 * @param anchura
	 * @param precio
	 * @throws ModeloException Se lanza cuando el modelo es null o vacío
	 * @throws PrecioException Se lanza cuando el precio es negativo
	 */
	public Mando(String modelo, double altura, double anchura, double precio) throws ModeloException, PrecioException{
		this(modelo, altura, anchura);
		
		if(precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public int compareTo(Mando o) {
		return modelo.compareTo(o.modelo);
	}

	@Override
	public String toString() {
		return "Mando [modelo=" + modelo + ", altura=" + altura + ", anchura=" + anchura + ", precio=" + precio
				+ ", encendido=" + encendido + "]";
	}

	
}
