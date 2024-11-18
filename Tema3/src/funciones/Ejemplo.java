package funciones;

public class Ejemplo {

	public static void main(String[] args) {
		int num = 5;
		int res = suma(4, num);
		System.out.println(num);
		
		System.out.println(res);
	}
	
	static int suma(int num1, int num2) {
		num2++;
		int resultado = num1 + num2;
		
		return resultado;
	}

}
