import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter the " + (i + 1) + ". element of the array:");
			array[i] = sc.nextInt();
		}

		System.out.println("List is:\t" + Arrays.toString(array));

		int[] sorted_array = sorting(array);
		System.out.println("Sorted Array is:\t" + Arrays.toString(sorted_array));

	}

}

