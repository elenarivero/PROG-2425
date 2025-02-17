package clases;

import java.util.Arrays;

import parte2.ejercicio04.Pizza;

public class Ejemplo {
	static int[] someInt = {10, 9, 8};
	
	public static void main(String[] args) {
		changeIt(someInt);
		System.out.println(Arrays.toString(someInt));
		Pizza p = new Pizza(0, "mediana", "margarita");
	}

	public static void changeIt(int[] a) {
		a[0] = 20;
	}
}
