package parte1.ejercicio3;

public class Rectangulo {

	private int x1;
	private int y1;

	private int x2;
	private int y2;

	public Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	/**
	 * Modifica el valor de la Y de la primera coordenada
	 * 
	 * @param y1 Nuevo valor Y para la primera coordenada. Solo se modifica si es
	 *           menor que la Y de la segunda coordenada.
	 */
	public void setY1(int y1) {
		if(y1 < this.y2)
			this.y1 = y1;
	}

	/**
	 * Devuelve el valor X de la segunda coordenada
	 * 
	 * @return La X de la segunda coordenada
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica la X de la segunda coordenada
	 * 
	 * @param x2 Nuevo valor para la X de la segunda coordenada. Su valor tiene que
	 *           ser mayor que la X de la primera coordenada.
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * Getter de la y de la segunda coordenada
	 * 
	 * @return El valor y de la segunda coordenada
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Setter de la y de la segunda coordenada
	 * 
	 * @param y2 Nuevo valor para la y de la segunda coordenada
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * Setter para modificar los valores de la primera coordenada
	 * 
	 * @param x1 Coordenada x del primer punto
	 * @param y1 Coordenada y del primer punto
	 */
	public void setX1Y1(int x1, int y1) {
		if (x1 < this.x2 && y1 < this.y2) {
			this.x1 = x1;
			this.y1 = y1;
		}
	}

	/**
	 * Setter para modificar las segundas coordenadas
	 * 
	 * @param x2 Coordenada x del segundo punto del rectángulo
	 * @param y2 Coordenada y del segundo punto del rectángulo
	 */
	public void setX2Y2(int x2, int y2) {
		if (this.x1 < x2 && this.y1 < y2) {
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Setter para modificar las 4 coordenadas
	 * 
	 * @param x1 Coordena x de la primera coordenada
	 * @param y1 Coordena y de la primera coordenada
	 * @param x2 Coordena x de la segunda coordenada
	 * @param y2 Coordena y de la segunda coordenada
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Calcula el perímetro del rectángulo en base a las coordenadas
	 * 
	 * @return El perímetro del rectángulo
	 */
	public int getPerimetro() {
		int base = x2 - x1;
		int altura = y2 - y1;

		int perimetro = 2 * (base + altura);

		return perimetro;
	}

	/**
	 * Calcula el área del rectángulo en base a las coordenadas
	 * 
	 * @return Área del rectángulo
	 */
	public int getArea() {
		int base = x2 - x1;
		int altura = y2 - y1;

		int area = base * altura;
		return area;
	}

}
