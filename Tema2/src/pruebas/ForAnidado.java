package pruebas;

public class ForAnidado {

	public static void main(String[] args) {

		for(int i=1; i<= 4; i++) {
			for(int j=1; j<= 3; j++) {
				System.out.println("i: " + i + ", j: " + j);
				if (j == i) {
					System.out.println("Me salgo del bucle");
					break;
				}
			}
			
		}

	}

}
