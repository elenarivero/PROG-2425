package boletin4.bidimensional;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		int tabla[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int res[][] = transposicion(tabla);
		
		for(int i = 0; i< res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int[][] transposicion(int tabla[][]){
		int[][] tablaRes = new int[tabla.length][tabla[0].length];
		
		for(int i=0; i<tabla.length; i++) {
			for(int j=0; j<tabla[i].length; j++) {
				tablaRes[j][i] = tabla[i][j];
			}
		}
		
		return tablaRes;
		
	}
}
