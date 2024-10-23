package pruebas;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			i++;
			if (i == 2) {
				continue;
			}
			
			System.out.println("La i vale " + i);
		}

	}

}
