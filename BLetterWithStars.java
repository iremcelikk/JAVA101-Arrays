
public class BLetterWithStars {

	public static void main(String[] args) {
		int[][] array = new int[8][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((j == 0) || (j == 3 && (i != 0) && (i != 3) && (i != 7))
						|| ((i == 0 || i == 3 || i == 7) && (j != 3))) {
					System.out.print(" * ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
