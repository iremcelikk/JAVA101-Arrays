import java.util.Scanner;

public class MatrixTranspose {

	static int[][] createTranspose(int[][] matrix) {
		int[][] transMatrix = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transMatrix[j][i] = matrix[i][j];
			}
		}
		return transMatrix;
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineLength, columnLength;

		System.out.println("Enter the line length:");
		lineLength = sc.nextInt();

		System.out.println("Enter the column length:");
		columnLength = sc.nextInt();

		int[][] matrix = new int[lineLength][columnLength];
		int count = 1;
		for (int i = 0; i < lineLength; i++) {
			for (int j = 0; j < columnLength; j++) {
				System.out.println("Enter " + count + ". the element:");
				matrix[i][j] = sc.nextInt();
				count++;
			}
		}

		System.out.println("Matrix:");
		printMatrix(matrix);

		int[][] transMatrix = createTranspose(matrix);
		System.out.println("Transpose Matrix:");
		printMatrix(transMatrix);
	}

}
