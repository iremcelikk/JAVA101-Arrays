
public class BLetterWithStars {

	public static void main(String[] args) {
		int[][] list = new int[8][4];

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
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