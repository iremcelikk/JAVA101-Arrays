import java.util.Scanner;
import java.util.Arrays;

public class RepeatingNumbersInArray {

	static void findRepeatingNumbers(int[] array) {
		String[] strArray = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			strArray[i] = String.valueOf(array[i]);
		}

		for (int i = 0; i < strArray.length - 1; i++) {
			int counter = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					counter++;
					strArray[j] = "Already counted";
				}
			}

			if (counter > 1 && !(strArray[i].equals("Already counted"))) {
				System.out.println(array[i] + " is repeting " + counter + " times.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter the " + (i + 1) + ". element of the array:");
			array[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(array));
		findRepeatingNumbers(array);
	}

}
