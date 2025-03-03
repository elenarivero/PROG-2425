package crud.disco;

import java.util.Objects;

public class Disco {

	enum Genero {ROCK, POP, JAZZ, BLUES}
	
	private int codigo;
	private String autor;
	private String titulo;
	private double duracion;
	private Genero genero;
	
	public Disco(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
	}
	
	public Disco(int codigo, String autor, String titulo, double duracion, Genero genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public Genero getGenero() {
		return genero;
	}
	
	@Override
	public String toString() {
		return this.codigo + " " + this.titulo + " " + this.autor + " " + this.genero + this.duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		//boolean res = false;
		
		Disco disco = (Disco) obj;
		return disco.codigo == this.codigo;
		
//		if(disco.codigo == this.codigo) {
//			res = true;
		//}
		
		//return res;
	}
	
	
	
	
}
