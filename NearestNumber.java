import java.util.Arrays;
import java.util.Scanner;

public class NearestNumber {

	static int[] sorting(int[] list) {

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				int temp = 0;
				if (list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		return list;
	}

	static String[] findNearest(int[] list, int number) {
		int maxNearest = 0;
		int minNearest = list[list.length - 1];

		String bigNearest;
		String smallNearest;

		for (int i = 0; i < list.length; i++) {
			if (list[i] > number) {
				maxNearest = list[i];
				if (i - 1 >= 0) {
					minNearest = list[i - 1];
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

		System.out.println("Enter the length of list");
		int listLength = sc.nextInt();
		int[] list = new int[listLength];

		for (int i = 0; i < listLength; i++) {
			System.out.println("Enter the " + (i + 1) + ". element of the list:");
			list[i] = sc.nextInt();
		}

		System.out.println("List is:\t" + Arrays.toString(list));

		int[] sorted_list = sorting(list);
		System.out.println("Sorted List is:\t" + Arrays.toString(sorted_list));

		System.out.println("Enter the number to find big and small nearest numbers:");
		int number = sc.nextInt();

		String[] nearests = findNearest(sorted_list, number);

		String min_nearest = nearests[0];
		String max_nearest = nearests[1];

		System.out.println("Nearest big number close to " + number + " is: " + max_nearest);
		System.out.println("Nearest small number close to " + number + " is: " + min_nearest);
	}

}