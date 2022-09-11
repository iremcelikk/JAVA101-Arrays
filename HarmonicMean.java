
public class HarmonicMean {

	static double calculateHarmonicMean(int[] array) {
		double sum = 0;
		for (double i : array) {
			sum += 1 / i;
		}

		return array.length / sum;
	}

	public static void main(String[] args) {

		int[] array = { 2, 9, 36, 45, 11, 7, 2 };
		System.out.println("Harmonic Mean is: " + calculateHarmonicMean(array));
	}
}
