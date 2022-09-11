import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {

	static int[] sorting(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	static String[] findNearest(int[] array, int number) {
		int maxNearest = 0;
		int minNearest = array[array.length - 1];

		String bigNearest;
		String smallNearest;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > number) {
				maxNearest = array[i];
				if (i - 1 >= 0) {
					minNearest = array[i - 1];
				} else {
					minNearest = 0;
				}
				break;
			}
		}

		if (maxNearest == 0) {
			bigNearest = "There is no element bigger than the " + number;
		} else {
			bigNearest = String.valueOf(maxNearest);
		}
		if (minNearest == 0) {
			smallNearest = "There is no element smaller than the " + number;
		} else {
			smallNearest = String.valueOf(minNearest);
		}

		String[] nearests = { smallNearest, bigNearest };
		return nearests;
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

		System.out.println("Array is:\t" + Arrays.toString(array));

		int[] sorted_array = sorting(array);
		System.out.println("Sorted Array is:\t" + Arrays.toString(sorted_array));

		System.out.println("Enter the number to find big and small nearest numbers:");
		int number = sc.nextInt();

		String[] nearests = findNearest(sorted_array, number);

		String min_nearest = nearests[0];
		String max_nearest = nearests[1];

		System.out.println("Nearest big number close to " + number + " is: " + max_nearest);
		System.out.println("Nearest small number close to " + number + " is: " + min_nearest);
	}

}
