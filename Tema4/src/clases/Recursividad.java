package clases;

public class Recursividad {

	public static long factorial(int num) {
		long res = 0;
		
		if(num == 0) {
			res = 1;
		} else {
			res = num * factorial(num-1);
		}
		
		
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

}
