package boletin6;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable donde almacenar la suma de los números impares
		int suma = 0;
		
		// Variable donde almacenar los números impares
		int impar = 1;
		
		// Cuento 10 veces
		for(int cont=1; cont<=10; cont++) {
			suma += impar;
			impar += 2;
		}
		
		// Imprimo la suma
		System.out.println("La suma de los números impares " + suma);
	}

}
