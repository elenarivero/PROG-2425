package arrays;

import java.util.Arrays;

public class MismoArray {

	public static void main(String[] args) {
		char[] arrayA = new char[5];
		char[] arrayB = new char[7];
		
		Arrays.fill(arrayA, 'a');
		Arrays.fill(arrayB, 'b');
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		
		arrayA = arrayB;
		arrayA[1] = 'z';
		arrayB[2] = 'q';
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		
		arrayB = new char[10];
		System.out.println(Arrays.toString(arrayB));
	}

}
