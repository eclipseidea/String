package string;

import java.util.Arrays;
import java.util.Scanner;

public class Stringa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT YOUR STRING");
		String string = scanner.nextLine();
		String[] array = (string.replaceAll("\\D+", " ").trim()).split(" ");
		int[] intArray = new int[array.length];
		int maxDigit = 0;
		for (int i = 0; i < array.length; i++) {
			intArray[i] = Integer.valueOf(array[i]);
			if (intArray[i] > maxDigit) {
				maxDigit = intArray[i];
			}
		}

		System.out.println("all array " + Arrays.toString(intArray));
		System.out.println("max digit = " + maxDigit);
		scanner.close();
	}
}
