package crud.disco;

import java.util.Objects;

public class Disco {

	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}

	private int codigo;
	private String autor;
	private String titulo;
	private double duracion;
	private Genero genero = Genero.POP;

	public Disco(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * 
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracion = duracion;
		compruebaGenero(genero);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
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

	private void compruebaGenero(String genero) {
		if (genero != null) {
			switch (genero) {
			case "ROCK", "POP", "JAZZ", "BLUES" -> this.genero = Genero.valueOf(genero);
			}
		}
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
		Disco discoEntrada = (Disco) obj;
		return discoEntrada.codigo == this.codigo;
	}

}
