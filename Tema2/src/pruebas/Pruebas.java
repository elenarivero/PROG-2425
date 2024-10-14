package pruebas;

public class Pruebas {

	public static void main(String[] args) {

		int a = 10;

		switch (a) {
		default:
			System.out.println("Sin coincidencia");
		case 1,2,3,4:
			if (a > 0) {
				System.out.println("Es positivo ");
			}
			break;
		case 5:
			System.out.println("Me ");
			break;
		case 8:
			System.out.println("Alegro ");
			break;
		case 9:
			System.out.println("De ");
			break;
		case 11:
			System.out.println("Conocerte ");
			break;
		
		}
	}

}
