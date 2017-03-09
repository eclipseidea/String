package string;

import java.util.Arrays;
import java.util.Scanner;

public class Stringa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT YOUR STRING");
		String string = scanner.nextLine();
		try {
			String[] array = (string.replaceAll("\\D+", " ").trim()).split(" ");
			int[] intArray = new int[array.length];
			int maxDigit = 0;
			int numberCount = 0;
			for (int i = 0; i < array.length; i++) {
				intArray[i] = Integer.valueOf(array[i]);
				numberCount++;
				if (intArray[i] > maxDigit) {
					maxDigit = intArray[i];
				}
			}
			System.out.println("ALL ARRAY = " + Arrays.toString(intArray));
			System.out.println("MAX NUMBER = " + maxDigit);
			System.out.println("QUONTITY OF NUMBERS = " + numberCount);

		} catch (NumberFormatException NumberFormatException) {
			System.err
					.println("NUMBERS NOT FOUND OR NUMBERS EXCEEDS THE VALUE OF INT");
			scanner.close();
		}
	}
}