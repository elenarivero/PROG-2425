package crud.alumno;

public class Alumno {

	private String nombre;
	private double notaMedia;
	
	public Alumno(String nombre) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public Alumno(String nombre, double media) {
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if(media >=0 && media <= 10) {
			this.notaMedia = media;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
