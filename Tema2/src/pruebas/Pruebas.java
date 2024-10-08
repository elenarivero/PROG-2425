package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		boolean flag = false;
		
		// flag == false
		if(!flag) {
			if(flag) {
				System.out.println("True False");
			} else {
				System.out.println("True True");
			}
		} else {
			System.out.println("False False");
		}
	}

}
