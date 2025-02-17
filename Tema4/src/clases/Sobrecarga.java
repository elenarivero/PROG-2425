package clases;

public class Sobrecarga {

	static int suma(int a, int b) {
		return suma(a+1, b+1);
	}

	static double suma(int a1, double b2) {
		return a1 + b2;
	}

	public static void main(String[] args) {
		System.out.println(suma(1, 3));
//		System.out.println(suma(1.0, 3.0));
//		System.out.println(suma(1, 3.0));
//		System.out.println(suma(3.0, '1'));

	}

}
